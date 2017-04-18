package org.xtext.urdf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.urdf.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotName'", "','", "'Link'", "'inertial'", "'visuals'", "'collision'", "'Joint'", "'Type'", "'ChildOf'", "'('", "')'", "'ParentOf'", "'limit'", "'axis'", "'origin'", "'callibration'", "'dynamics'", "'mimic'", "'safetycontroller'", "'mass'", "'inertia'", "'material'", "'geometry'", "'x'", "'y'", "'z'", "'Roll'", "'Pitch'", "'Yaw'", "'Mass'", "'Inertia'", "'Material'", "'Geometry'", "'Color'", "'Texture'", "'Box'", "'Cylinder'", "'Mesh'", "'Sphere'", "'Lower'", "'Upper'", "'Effort'", "'Velocity'", "'Rising'", "'Falling'", "'Friction'", "'Damping'", "'Multiplier'", "'OffSet'", "'SoftLowerLimit'", "'SoftUpperLimit'", "'k_position'", "'k_velocity'", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Robot";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobot"
    // InternalDsl.g:65:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalDsl.g:65:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalDsl.g:66:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )? ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_link_2_0 = null;

        EObject lv_link_4_0 = null;

        EObject lv_joint_5_0 = null;

        EObject lv_joint_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )? ) )
            // InternalDsl.g:79:2: (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )? )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )? )
            // InternalDsl.g:80:3: otherlv_0= 'RobotName' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_link_2_0= ruleLink ) ) (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )* ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotNameKeyword_0());
            		
            // InternalDsl.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:102:3: ( (lv_link_2_0= ruleLink ) )
            // InternalDsl.g:103:4: (lv_link_2_0= ruleLink )
            {
            // InternalDsl.g:103:4: (lv_link_2_0= ruleLink )
            // InternalDsl.g:104:5: lv_link_2_0= ruleLink
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_link_2_0=ruleLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					add(
            						current,
            						"link",
            						lv_link_2_0,
            						"org.xtext.urdf.Dsl.Link");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:121:3: (otherlv_3= ',' ( (lv_link_4_0= ruleLink ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:122:4: otherlv_3= ',' ( (lv_link_4_0= ruleLink ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalDsl.g:126:4: ( (lv_link_4_0= ruleLink ) )
            	    // InternalDsl.g:127:5: (lv_link_4_0= ruleLink )
            	    {
            	    // InternalDsl.g:127:5: (lv_link_4_0= ruleLink )
            	    // InternalDsl.g:128:6: lv_link_4_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_link_4_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"link",
            	    							lv_link_4_0,
            	    							"org.xtext.urdf.Dsl.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:146:3: ( ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:147:4: ( (lv_joint_5_0= ruleJoint ) ) ( (lv_joint_6_0= ruleJoint ) )*
                    {
                    // InternalDsl.g:147:4: ( (lv_joint_5_0= ruleJoint ) )
                    // InternalDsl.g:148:5: (lv_joint_5_0= ruleJoint )
                    {
                    // InternalDsl.g:148:5: (lv_joint_5_0= ruleJoint )
                    // InternalDsl.g:149:6: lv_joint_5_0= ruleJoint
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_joint_5_0=ruleJoint();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"joint",
                    							lv_joint_5_0,
                    							"org.xtext.urdf.Dsl.Joint");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:166:4: ( (lv_joint_6_0= ruleJoint ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalDsl.g:167:5: (lv_joint_6_0= ruleJoint )
                    	    {
                    	    // InternalDsl.g:167:5: (lv_joint_6_0= ruleJoint )
                    	    // InternalDsl.g:168:6: lv_joint_6_0= ruleJoint
                    	    {

                    	    						newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_joint_6_0=ruleJoint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"joint",
                    	    							lv_joint_6_0,
                    	    							"org.xtext.urdf.Dsl.Joint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMaterial"
    // InternalDsl.g:190:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalDsl.g:190:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalDsl.g:191:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDsl.g:197:1: ruleMaterial returns [EObject current=null] : (this_Material_Impl_0= ruleMaterial_Impl | this_Color_1= ruleColor | this_Texture_2= ruleTexture ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        EObject this_Material_Impl_0 = null;

        EObject this_Color_1 = null;

        EObject this_Texture_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:203:2: ( (this_Material_Impl_0= ruleMaterial_Impl | this_Color_1= ruleColor | this_Texture_2= ruleTexture ) )
            // InternalDsl.g:204:2: (this_Material_Impl_0= ruleMaterial_Impl | this_Color_1= ruleColor | this_Texture_2= ruleTexture )
            {
            // InternalDsl.g:204:2: (this_Material_Impl_0= ruleMaterial_Impl | this_Color_1= ruleColor | this_Texture_2= ruleTexture )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 44:
                {
                alt4=2;
                }
                break;
            case 45:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:205:3: this_Material_Impl_0= ruleMaterial_Impl
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getMaterial_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Material_Impl_0=ruleMaterial_Impl();

                    state._fsp--;


                    			current = this_Material_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:214:3: this_Color_1= ruleColor
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getColorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Color_1=ruleColor();

                    state._fsp--;


                    			current = this_Color_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:223:3: this_Texture_2= ruleTexture
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getTextureParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texture_2=ruleTexture();

                    state._fsp--;


                    			current = this_Texture_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleGeometry"
    // InternalDsl.g:235:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalDsl.g:235:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalDsl.g:236:2: iv_ruleGeometry= ruleGeometry EOF
            {
             newCompositeNode(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeometry=ruleGeometry();

            state._fsp--;

             current =iv_ruleGeometry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalDsl.g:242:1: ruleGeometry returns [EObject current=null] : (this_Geometry_Impl_0= ruleGeometry_Impl | this_Box_1= ruleBox | this_Cylinder_2= ruleCylinder | this_Mesh_3= ruleMesh | this_Sphere_4= ruleSphere ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        EObject this_Geometry_Impl_0 = null;

        EObject this_Box_1 = null;

        EObject this_Cylinder_2 = null;

        EObject this_Mesh_3 = null;

        EObject this_Sphere_4 = null;



        	enterRule();

        try {
            // InternalDsl.g:248:2: ( (this_Geometry_Impl_0= ruleGeometry_Impl | this_Box_1= ruleBox | this_Cylinder_2= ruleCylinder | this_Mesh_3= ruleMesh | this_Sphere_4= ruleSphere ) )
            // InternalDsl.g:249:2: (this_Geometry_Impl_0= ruleGeometry_Impl | this_Box_1= ruleBox | this_Cylinder_2= ruleCylinder | this_Mesh_3= ruleMesh | this_Sphere_4= ruleSphere )
            {
            // InternalDsl.g:249:2: (this_Geometry_Impl_0= ruleGeometry_Impl | this_Box_1= ruleBox | this_Cylinder_2= ruleCylinder | this_Mesh_3= ruleMesh | this_Sphere_4= ruleSphere )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt5=1;
                }
                break;
            case 46:
                {
                alt5=2;
                }
                break;
            case 47:
                {
                alt5=3;
                }
                break;
            case 48:
                {
                alt5=4;
                }
                break;
            case 49:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:250:3: this_Geometry_Impl_0= ruleGeometry_Impl
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getGeometry_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Geometry_Impl_0=ruleGeometry_Impl();

                    state._fsp--;


                    			current = this_Geometry_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:259:3: this_Box_1= ruleBox
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getBoxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Box_1=ruleBox();

                    state._fsp--;


                    			current = this_Box_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:268:3: this_Cylinder_2= ruleCylinder
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cylinder_2=ruleCylinder();

                    state._fsp--;


                    			current = this_Cylinder_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:277:3: this_Mesh_3= ruleMesh
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getMeshParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mesh_3=ruleMesh();

                    state._fsp--;


                    			current = this_Mesh_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDsl.g:286:3: this_Sphere_4= ruleSphere
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getSphereParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sphere_4=ruleSphere();

                    state._fsp--;


                    			current = this_Sphere_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:298:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:298:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:299:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:305:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_inertial_4_0 = null;

        EObject lv_inertial_5_0 = null;

        EObject lv_visuals_7_0 = null;

        EObject lv_visuals_8_0 = null;

        EObject lv_collision_10_0 = null;

        EObject lv_collision_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:311:2: ( ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )? ) )
            // InternalDsl.g:312:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )? )
            {
            // InternalDsl.g:312:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )? )
            // InternalDsl.g:313:3: () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )? (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )? (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )?
            {
            // InternalDsl.g:313:3: ()
            // InternalDsl.g:314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalDsl.g:324:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:325:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:325:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:326:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:342:3: (otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:343:4: otherlv_3= 'inertial' ( (lv_inertial_4_0= ruleInertial ) ) ( (lv_inertial_5_0= ruleInertial ) )*
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getInertialKeyword_3_0());
                    			
                    // InternalDsl.g:347:4: ( (lv_inertial_4_0= ruleInertial ) )
                    // InternalDsl.g:348:5: (lv_inertial_4_0= ruleInertial )
                    {
                    // InternalDsl.g:348:5: (lv_inertial_4_0= ruleInertial )
                    // InternalDsl.g:349:6: lv_inertial_4_0= ruleInertial
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_inertial_4_0=ruleInertial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						add(
                    							current,
                    							"inertial",
                    							lv_inertial_4_0,
                    							"org.xtext.urdf.Dsl.Inertial");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:366:4: ( (lv_inertial_5_0= ruleInertial ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDsl.g:367:5: (lv_inertial_5_0= ruleInertial )
                    	    {
                    	    // InternalDsl.g:367:5: (lv_inertial_5_0= ruleInertial )
                    	    // InternalDsl.g:368:6: lv_inertial_5_0= ruleInertial
                    	    {

                    	    						newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_inertial_5_0=ruleInertial();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inertial",
                    	    							lv_inertial_5_0,
                    	    							"org.xtext.urdf.Dsl.Inertial");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:386:3: (otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:387:4: otherlv_6= 'visuals' ( (lv_visuals_7_0= ruleVisual ) ) ( (lv_visuals_8_0= ruleVisual ) )*
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getLinkAccess().getVisualsKeyword_4_0());
                    			
                    // InternalDsl.g:391:4: ( (lv_visuals_7_0= ruleVisual ) )
                    // InternalDsl.g:392:5: (lv_visuals_7_0= ruleVisual )
                    {
                    // InternalDsl.g:392:5: (lv_visuals_7_0= ruleVisual )
                    // InternalDsl.g:393:6: lv_visuals_7_0= ruleVisual
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_visuals_7_0=ruleVisual();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						add(
                    							current,
                    							"visuals",
                    							lv_visuals_7_0,
                    							"org.xtext.urdf.Dsl.Visual");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:410:4: ( (lv_visuals_8_0= ruleVisual ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==25||LA8_0==32) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDsl.g:411:5: (lv_visuals_8_0= ruleVisual )
                    	    {
                    	    // InternalDsl.g:411:5: (lv_visuals_8_0= ruleVisual )
                    	    // InternalDsl.g:412:6: lv_visuals_8_0= ruleVisual
                    	    {

                    	    						newCompositeNode(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_visuals_8_0=ruleVisual();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"visuals",
                    	    							lv_visuals_8_0,
                    	    							"org.xtext.urdf.Dsl.Visual");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:430:3: (otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:431:4: otherlv_9= 'collision' ( (lv_collision_10_0= ruleCollision ) ) ( (lv_collision_11_0= ruleCollision ) )*
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getLinkAccess().getCollisionKeyword_5_0());
                    			
                    // InternalDsl.g:435:4: ( (lv_collision_10_0= ruleCollision ) )
                    // InternalDsl.g:436:5: (lv_collision_10_0= ruleCollision )
                    {
                    // InternalDsl.g:436:5: (lv_collision_10_0= ruleCollision )
                    // InternalDsl.g:437:6: lv_collision_10_0= ruleCollision
                    {

                    						newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_collision_10_0=ruleCollision();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    						}
                    						add(
                    							current,
                    							"collision",
                    							lv_collision_10_0,
                    							"org.xtext.urdf.Dsl.Collision");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:454:4: ( (lv_collision_11_0= ruleCollision ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==33) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:455:5: (lv_collision_11_0= ruleCollision )
                    	    {
                    	    // InternalDsl.g:455:5: (lv_collision_11_0= ruleCollision )
                    	    // InternalDsl.g:456:6: lv_collision_11_0= ruleCollision
                    	    {

                    	    						newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_collision_11_0=ruleCollision();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"collision",
                    	    							lv_collision_11_0,
                    	    							"org.xtext.urdf.Dsl.Collision");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalDsl.g:478:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalDsl.g:478:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalDsl.g:479:2: iv_ruleJoint= ruleJoint EOF
            {
             newCompositeNode(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoint=ruleJoint();

            state._fsp--;

             current =iv_ruleJoint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalDsl.g:485:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) ( (otherlv_7= RULE_STRING ) )* otherlv_8= ')' otherlv_9= 'ParentOf' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= 'origin' ( (lv_origin_16_0= ruleOrigin ) ) (otherlv_17= 'callibration' ( (lv_callibration_18_0= ruleCallibration ) ) )? (otherlv_19= 'dynamics' ( (lv_dynamics_20_0= ruleDynamics ) ) )? (otherlv_21= 'mimic' ( (lv_mimic_22_0= ruleMimic ) ) )? (otherlv_23= 'safetycontroller' ( (lv_safetycontroller_24_0= ruleSafetyController ) ) )? ) ;
    public final EObject ruleJoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Enumerator lv_Type_3_0 = null;

        EObject lv_limit_12_0 = null;

        EObject lv_axis_14_0 = null;

        EObject lv_origin_16_0 = null;

        EObject lv_callibration_18_0 = null;

        EObject lv_dynamics_20_0 = null;

        EObject lv_mimic_22_0 = null;

        EObject lv_safetycontroller_24_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:491:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) ( (otherlv_7= RULE_STRING ) )* otherlv_8= ')' otherlv_9= 'ParentOf' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= 'origin' ( (lv_origin_16_0= ruleOrigin ) ) (otherlv_17= 'callibration' ( (lv_callibration_18_0= ruleCallibration ) ) )? (otherlv_19= 'dynamics' ( (lv_dynamics_20_0= ruleDynamics ) ) )? (otherlv_21= 'mimic' ( (lv_mimic_22_0= ruleMimic ) ) )? (otherlv_23= 'safetycontroller' ( (lv_safetycontroller_24_0= ruleSafetyController ) ) )? ) )
            // InternalDsl.g:492:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) ( (otherlv_7= RULE_STRING ) )* otherlv_8= ')' otherlv_9= 'ParentOf' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= 'origin' ( (lv_origin_16_0= ruleOrigin ) ) (otherlv_17= 'callibration' ( (lv_callibration_18_0= ruleCallibration ) ) )? (otherlv_19= 'dynamics' ( (lv_dynamics_20_0= ruleDynamics ) ) )? (otherlv_21= 'mimic' ( (lv_mimic_22_0= ruleMimic ) ) )? (otherlv_23= 'safetycontroller' ( (lv_safetycontroller_24_0= ruleSafetyController ) ) )? )
            {
            // InternalDsl.g:492:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) ( (otherlv_7= RULE_STRING ) )* otherlv_8= ')' otherlv_9= 'ParentOf' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= 'origin' ( (lv_origin_16_0= ruleOrigin ) ) (otherlv_17= 'callibration' ( (lv_callibration_18_0= ruleCallibration ) ) )? (otherlv_19= 'dynamics' ( (lv_dynamics_20_0= ruleDynamics ) ) )? (otherlv_21= 'mimic' ( (lv_mimic_22_0= ruleMimic ) ) )? (otherlv_23= 'safetycontroller' ( (lv_safetycontroller_24_0= ruleSafetyController ) ) )? )
            // InternalDsl.g:493:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )? otherlv_4= 'ChildOf' otherlv_5= '(' ( (otherlv_6= RULE_STRING ) ) ( (otherlv_7= RULE_STRING ) )* otherlv_8= ')' otherlv_9= 'ParentOf' ( (otherlv_10= RULE_STRING ) ) (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )? (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )? otherlv_15= 'origin' ( (lv_origin_16_0= ruleOrigin ) ) (otherlv_17= 'callibration' ( (lv_callibration_18_0= ruleCallibration ) ) )? (otherlv_19= 'dynamics' ( (lv_dynamics_20_0= ruleDynamics ) ) )? (otherlv_21= 'mimic' ( (lv_mimic_22_0= ruleMimic ) ) )? (otherlv_23= 'safetycontroller' ( (lv_safetycontroller_24_0= ruleSafetyController ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalDsl.g:497:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:498:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:498:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:499:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:515:3: (otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:516:4: otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getJointAccess().getTypeKeyword_2_0());
                    			
                    // InternalDsl.g:520:4: ( (lv_Type_3_0= ruleJointType ) )
                    // InternalDsl.g:521:5: (lv_Type_3_0= ruleJointType )
                    {
                    // InternalDsl.g:521:5: (lv_Type_3_0= ruleJointType )
                    // InternalDsl.g:522:6: lv_Type_3_0= ruleJointType
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_Type_3_0=ruleJointType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_3_0,
                    							"org.xtext.urdf.Dsl.JointType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getChildOfKeyword_3());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getJointAccess().getLeftParenthesisKeyword_4());
            		
            // InternalDsl.g:548:3: ( (otherlv_6= RULE_STRING ) )
            // InternalDsl.g:549:4: (otherlv_6= RULE_STRING )
            {
            // InternalDsl.g:549:4: (otherlv_6= RULE_STRING )
            // InternalDsl.g:550:5: otherlv_6= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(otherlv_6, grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0());
            				

            }


            }

            // InternalDsl.g:561:3: ( (otherlv_7= RULE_STRING ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDsl.g:562:4: (otherlv_7= RULE_STRING )
            	    {
            	    // InternalDsl.g:562:4: (otherlv_7= RULE_STRING )
            	    // InternalDsl.g:563:5: otherlv_7= RULE_STRING
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getJointRule());
            	    					}
            	    				
            	    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    					newLeafNode(otherlv_7, grammarAccess.getJointAccess().getChildOfLinkCrossReference_6_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getJointAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getJointAccess().getParentOfKeyword_8());
            		
            // InternalDsl.g:582:3: ( (otherlv_10= RULE_STRING ) )
            // InternalDsl.g:583:4: (otherlv_10= RULE_STRING )
            {
            // InternalDsl.g:583:4: (otherlv_10= RULE_STRING )
            // InternalDsl.g:584:5: otherlv_10= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(otherlv_10, grammarAccess.getJointAccess().getParentOfLinkCrossReference_9_0());
            				

            }


            }

            // InternalDsl.g:595:3: (otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:596:4: otherlv_11= 'limit' ( (lv_limit_12_0= ruleLimit ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getJointAccess().getLimitKeyword_10_0());
                    			
                    // InternalDsl.g:600:4: ( (lv_limit_12_0= ruleLimit ) )
                    // InternalDsl.g:601:5: (lv_limit_12_0= ruleLimit )
                    {
                    // InternalDsl.g:601:5: (lv_limit_12_0= ruleLimit )
                    // InternalDsl.g:602:6: lv_limit_12_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_limit_12_0=ruleLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_12_0,
                    							"org.xtext.urdf.Dsl.Limit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:620:3: (otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:621:4: otherlv_13= 'axis' ( (lv_axis_14_0= ruleAxis ) )
                    {
                    otherlv_13=(Token)match(input,24,FOLLOW_24); 

                    				newLeafNode(otherlv_13, grammarAccess.getJointAccess().getAxisKeyword_11_0());
                    			
                    // InternalDsl.g:625:4: ( (lv_axis_14_0= ruleAxis ) )
                    // InternalDsl.g:626:5: (lv_axis_14_0= ruleAxis )
                    {
                    // InternalDsl.g:626:5: (lv_axis_14_0= ruleAxis )
                    // InternalDsl.g:627:6: lv_axis_14_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_axis_14_0=ruleAxis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_14_0,
                    							"org.xtext.urdf.Dsl.Axis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_15, grammarAccess.getJointAccess().getOriginKeyword_12());
            		
            // InternalDsl.g:649:3: ( (lv_origin_16_0= ruleOrigin ) )
            // InternalDsl.g:650:4: (lv_origin_16_0= ruleOrigin )
            {
            // InternalDsl.g:650:4: (lv_origin_16_0= ruleOrigin )
            // InternalDsl.g:651:5: lv_origin_16_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_26);
            lv_origin_16_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJointRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_16_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:668:3: (otherlv_17= 'callibration' ( (lv_callibration_18_0= ruleCallibration ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:669:4: otherlv_17= 'callibration' ( (lv_callibration_18_0= ruleCallibration ) )
                    {
                    otherlv_17=(Token)match(input,26,FOLLOW_27); 

                    				newLeafNode(otherlv_17, grammarAccess.getJointAccess().getCallibrationKeyword_14_0());
                    			
                    // InternalDsl.g:673:4: ( (lv_callibration_18_0= ruleCallibration ) )
                    // InternalDsl.g:674:5: (lv_callibration_18_0= ruleCallibration )
                    {
                    // InternalDsl.g:674:5: (lv_callibration_18_0= ruleCallibration )
                    // InternalDsl.g:675:6: lv_callibration_18_0= ruleCallibration
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getCallibrationCallibrationParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_callibration_18_0=ruleCallibration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"callibration",
                    							lv_callibration_18_0,
                    							"org.xtext.urdf.Dsl.Callibration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:693:3: (otherlv_19= 'dynamics' ( (lv_dynamics_20_0= ruleDynamics ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:694:4: otherlv_19= 'dynamics' ( (lv_dynamics_20_0= ruleDynamics ) )
                    {
                    otherlv_19=(Token)match(input,27,FOLLOW_29); 

                    				newLeafNode(otherlv_19, grammarAccess.getJointAccess().getDynamicsKeyword_15_0());
                    			
                    // InternalDsl.g:698:4: ( (lv_dynamics_20_0= ruleDynamics ) )
                    // InternalDsl.g:699:5: (lv_dynamics_20_0= ruleDynamics )
                    {
                    // InternalDsl.g:699:5: (lv_dynamics_20_0= ruleDynamics )
                    // InternalDsl.g:700:6: lv_dynamics_20_0= ruleDynamics
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_dynamics_20_0=ruleDynamics();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"dynamics",
                    							lv_dynamics_20_0,
                    							"org.xtext.urdf.Dsl.Dynamics");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:718:3: (otherlv_21= 'mimic' ( (lv_mimic_22_0= ruleMimic ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:719:4: otherlv_21= 'mimic' ( (lv_mimic_22_0= ruleMimic ) )
                    {
                    otherlv_21=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_21, grammarAccess.getJointAccess().getMimicKeyword_16_0());
                    			
                    // InternalDsl.g:723:4: ( (lv_mimic_22_0= ruleMimic ) )
                    // InternalDsl.g:724:5: (lv_mimic_22_0= ruleMimic )
                    {
                    // InternalDsl.g:724:5: (lv_mimic_22_0= ruleMimic )
                    // InternalDsl.g:725:6: lv_mimic_22_0= ruleMimic
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_mimic_22_0=ruleMimic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"mimic",
                    							lv_mimic_22_0,
                    							"org.xtext.urdf.Dsl.Mimic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:743:3: (otherlv_23= 'safetycontroller' ( (lv_safetycontroller_24_0= ruleSafetyController ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:744:4: otherlv_23= 'safetycontroller' ( (lv_safetycontroller_24_0= ruleSafetyController ) )
                    {
                    otherlv_23=(Token)match(input,29,FOLLOW_33); 

                    				newLeafNode(otherlv_23, grammarAccess.getJointAccess().getSafetycontrollerKeyword_17_0());
                    			
                    // InternalDsl.g:748:4: ( (lv_safetycontroller_24_0= ruleSafetyController ) )
                    // InternalDsl.g:749:5: (lv_safetycontroller_24_0= ruleSafetyController )
                    {
                    // InternalDsl.g:749:5: (lv_safetycontroller_24_0= ruleSafetyController )
                    // InternalDsl.g:750:6: lv_safetycontroller_24_0= ruleSafetyController
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_safetycontroller_24_0=ruleSafetyController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"safetycontroller",
                    							lv_safetycontroller_24_0,
                    							"org.xtext.urdf.Dsl.SafetyController");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:772:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalDsl.g:772:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalDsl.g:773:2: iv_ruleInertial= ruleInertial EOF
            {
             newCompositeNode(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertial=ruleInertial();

            state._fsp--;

             current =iv_ruleInertial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalDsl.g:779:1: ruleInertial returns [EObject current=null] : (otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )? ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_origin_1_0 = null;

        EObject lv_mass_3_0 = null;

        EObject lv_mass_5_0 = null;

        EObject lv_inertia_7_0 = null;

        EObject lv_inertia_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:785:2: ( (otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )? ) )
            // InternalDsl.g:786:2: (otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )? )
            {
            // InternalDsl.g:786:2: (otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )? )
            // InternalDsl.g:787:3: otherlv_0= 'origin' ( (lv_origin_1_0= ruleOrigin ) ) (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )? (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getInertialAccess().getOriginKeyword_0());
            		
            // InternalDsl.g:791:3: ( (lv_origin_1_0= ruleOrigin ) )
            // InternalDsl.g:792:4: (lv_origin_1_0= ruleOrigin )
            {
            // InternalDsl.g:792:4: (lv_origin_1_0= ruleOrigin )
            // InternalDsl.g:793:5: lv_origin_1_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_origin_1_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_1_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:810:3: (otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:811:4: otherlv_2= 'mass' ( (lv_mass_3_0= ruleMass ) ) (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )*
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_36); 

                    				newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getMassKeyword_2_0());
                    			
                    // InternalDsl.g:815:4: ( (lv_mass_3_0= ruleMass ) )
                    // InternalDsl.g:816:5: (lv_mass_3_0= ruleMass )
                    {
                    // InternalDsl.g:816:5: (lv_mass_3_0= ruleMass )
                    // InternalDsl.g:817:6: lv_mass_3_0= ruleMass
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_mass_3_0=ruleMass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						add(
                    							current,
                    							"mass",
                    							lv_mass_3_0,
                    							"org.xtext.urdf.Dsl.Mass");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:834:4: (otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==12) ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2==40) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalDsl.g:835:5: otherlv_4= ',' ( (lv_mass_5_0= ruleMass ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_36); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getInertialAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalDsl.g:839:5: ( (lv_mass_5_0= ruleMass ) )
                    	    // InternalDsl.g:840:6: (lv_mass_5_0= ruleMass )
                    	    {
                    	    // InternalDsl.g:840:6: (lv_mass_5_0= ruleMass )
                    	    // InternalDsl.g:841:7: lv_mass_5_0= ruleMass
                    	    {

                    	    							newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_mass_5_0=ruleMass();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInertialRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mass",
                    	    								lv_mass_5_0,
                    	    								"org.xtext.urdf.Dsl.Mass");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDsl.g:860:3: (otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:861:4: otherlv_6= 'inertia' ( (lv_inertia_7_0= ruleInertia ) ) ( (lv_inertia_8_0= ruleInertia ) )*
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getInertialAccess().getInertiaKeyword_3_0());
                    			
                    // InternalDsl.g:865:4: ( (lv_inertia_7_0= ruleInertia ) )
                    // InternalDsl.g:866:5: (lv_inertia_7_0= ruleInertia )
                    {
                    // InternalDsl.g:866:5: (lv_inertia_7_0= ruleInertia )
                    // InternalDsl.g:867:6: lv_inertia_7_0= ruleInertia
                    {

                    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_inertia_7_0=ruleInertia();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    						}
                    						add(
                    							current,
                    							"inertia",
                    							lv_inertia_7_0,
                    							"org.xtext.urdf.Dsl.Inertia");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:884:4: ( (lv_inertia_8_0= ruleInertia ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==41) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDsl.g:885:5: (lv_inertia_8_0= ruleInertia )
                    	    {
                    	    // InternalDsl.g:885:5: (lv_inertia_8_0= ruleInertia )
                    	    // InternalDsl.g:886:6: lv_inertia_8_0= ruleInertia
                    	    {

                    	    						newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_inertia_8_0=ruleInertia();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInertialRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inertia",
                    	    							lv_inertia_8_0,
                    	    							"org.xtext.urdf.Dsl.Inertia");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:908:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalDsl.g:908:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalDsl.g:909:2: iv_ruleVisual= ruleVisual EOF
            {
             newCompositeNode(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisual=ruleVisual();

            state._fsp--;

             current =iv_ruleVisual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalDsl.g:915:1: ruleVisual returns [EObject current=null] : ( (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_material_1_0 = null;

        EObject lv_origin_3_0 = null;

        EObject lv_geometry_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:921:2: ( ( (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) ) )
            // InternalDsl.g:922:2: ( (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) )
            {
            // InternalDsl.g:922:2: ( (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) ) )
            // InternalDsl.g:923:3: (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )? otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) otherlv_4= 'geometry' ( (lv_geometry_5_0= ruleGeometry ) )
            {
            // InternalDsl.g:923:3: (otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:924:4: otherlv_0= 'material' ( (lv_material_1_0= ruleMaterial ) )
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_40); 

                    				newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getMaterialKeyword_0_0());
                    			
                    // InternalDsl.g:928:4: ( (lv_material_1_0= ruleMaterial ) )
                    // InternalDsl.g:929:5: (lv_material_1_0= ruleMaterial )
                    {
                    // InternalDsl.g:929:5: (lv_material_1_0= ruleMaterial )
                    // InternalDsl.g:930:6: lv_material_1_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_material_1_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_1_0,
                    							"org.xtext.urdf.Dsl.Material");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getOriginKeyword_1());
            		
            // InternalDsl.g:952:3: ( (lv_origin_3_0= ruleOrigin ) )
            // InternalDsl.g:953:4: (lv_origin_3_0= ruleOrigin )
            {
            // InternalDsl.g:953:4: (lv_origin_3_0= ruleOrigin )
            // InternalDsl.g:954:5: lv_origin_3_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_origin_3_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_3_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getVisualAccess().getGeometryKeyword_3());
            		
            // InternalDsl.g:975:3: ( (lv_geometry_5_0= ruleGeometry ) )
            // InternalDsl.g:976:4: (lv_geometry_5_0= ruleGeometry )
            {
            // InternalDsl.g:976:4: (lv_geometry_5_0= ruleGeometry )
            // InternalDsl.g:977:5: lv_geometry_5_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_geometry_5_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_5_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:998:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalDsl.g:998:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalDsl.g:999:2: iv_ruleCollision= ruleCollision EOF
            {
             newCompositeNode(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCollision=ruleCollision();

            state._fsp--;

             current =iv_ruleCollision; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalDsl.g:1005:1: ruleCollision returns [EObject current=null] : (otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_geometry_1_0 = null;

        EObject lv_origin_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1011:2: ( (otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) ) )
            // InternalDsl.g:1012:2: (otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) )
            {
            // InternalDsl.g:1012:2: (otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) ) )
            // InternalDsl.g:1013:3: otherlv_0= 'geometry' ( (lv_geometry_1_0= ruleGeometry ) ) otherlv_2= 'origin' ( (lv_origin_3_0= ruleOrigin ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getCollisionAccess().getGeometryKeyword_0());
            		
            // InternalDsl.g:1017:3: ( (lv_geometry_1_0= ruleGeometry ) )
            // InternalDsl.g:1018:4: (lv_geometry_1_0= ruleGeometry )
            {
            // InternalDsl.g:1018:4: (lv_geometry_1_0= ruleGeometry )
            // InternalDsl.g:1019:5: lv_geometry_1_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_geometry_1_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_1_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getCollisionAccess().getOriginKeyword_2());
            		
            // InternalDsl.g:1040:3: ( (lv_origin_3_0= ruleOrigin ) )
            // InternalDsl.g:1041:4: (lv_origin_3_0= ruleOrigin )
            {
            // InternalDsl.g:1041:4: (lv_origin_3_0= ruleOrigin )
            // InternalDsl.g:1042:5: lv_origin_3_0= ruleOrigin
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_origin_3_0=ruleOrigin();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"origin",
            						lv_origin_3_0,
            						"org.xtext.urdf.Dsl.Origin");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:1063:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalDsl.g:1063:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalDsl.g:1064:2: iv_ruleOrigin= ruleOrigin EOF
            {
             newCompositeNode(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrigin=ruleOrigin();

            state._fsp--;

             current =iv_ruleOrigin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalDsl.g:1070:1: ruleOrigin returns [EObject current=null] : ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;
        Token lv_z_6_0=null;
        Token otherlv_7=null;
        Token lv_Roll_8_0=null;
        Token otherlv_9=null;
        Token lv_Pitch_10_0=null;
        Token otherlv_11=null;
        Token lv_Yaw_12_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1076:2: ( ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1077:2: ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1077:2: ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )? )
            // InternalDsl.g:1078:3: () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )? (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )? (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1078:3: ()
            // InternalDsl.g:1079:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOriginAccess().getOriginAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1085:3: (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1086:4: otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getXKeyword_1_0());
                    			
                    // InternalDsl.g:1090:4: ( (lv_x_2_0= RULE_INT ) )
                    // InternalDsl.g:1091:5: (lv_x_2_0= RULE_INT )
                    {
                    // InternalDsl.g:1091:5: (lv_x_2_0= RULE_INT )
                    // InternalDsl.g:1092:6: lv_x_2_0= RULE_INT
                    {
                    lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    						newLeafNode(lv_x_2_0, grammarAccess.getOriginAccess().getXINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1109:3: (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:1110:4: otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getOriginAccess().getYKeyword_2_0());
                    			
                    // InternalDsl.g:1114:4: ( (lv_y_4_0= RULE_INT ) )
                    // InternalDsl.g:1115:5: (lv_y_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1115:5: (lv_y_4_0= RULE_INT )
                    // InternalDsl.g:1116:6: lv_y_4_0= RULE_INT
                    {
                    lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_46); 

                    						newLeafNode(lv_y_4_0, grammarAccess.getOriginAccess().getYINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"y",
                    							lv_y_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1133:3: (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1134:4: otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getOriginAccess().getZKeyword_3_0());
                    			
                    // InternalDsl.g:1138:4: ( (lv_z_6_0= RULE_INT ) )
                    // InternalDsl.g:1139:5: (lv_z_6_0= RULE_INT )
                    {
                    // InternalDsl.g:1139:5: (lv_z_6_0= RULE_INT )
                    // InternalDsl.g:1140:6: lv_z_6_0= RULE_INT
                    {
                    lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_47); 

                    						newLeafNode(lv_z_6_0, grammarAccess.getOriginAccess().getZINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"z",
                    							lv_z_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1157:3: (otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1158:4: otherlv_7= 'Roll' ( (lv_Roll_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getOriginAccess().getRollKeyword_4_0());
                    			
                    // InternalDsl.g:1162:4: ( (lv_Roll_8_0= RULE_INT ) )
                    // InternalDsl.g:1163:5: (lv_Roll_8_0= RULE_INT )
                    {
                    // InternalDsl.g:1163:5: (lv_Roll_8_0= RULE_INT )
                    // InternalDsl.g:1164:6: lv_Roll_8_0= RULE_INT
                    {
                    lv_Roll_8_0=(Token)match(input,RULE_INT,FOLLOW_48); 

                    						newLeafNode(lv_Roll_8_0, grammarAccess.getOriginAccess().getRollINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Roll",
                    							lv_Roll_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1181:3: (otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1182:4: otherlv_9= 'Pitch' ( (lv_Pitch_10_0= RULE_INT ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_44); 

                    				newLeafNode(otherlv_9, grammarAccess.getOriginAccess().getPitchKeyword_5_0());
                    			
                    // InternalDsl.g:1186:4: ( (lv_Pitch_10_0= RULE_INT ) )
                    // InternalDsl.g:1187:5: (lv_Pitch_10_0= RULE_INT )
                    {
                    // InternalDsl.g:1187:5: (lv_Pitch_10_0= RULE_INT )
                    // InternalDsl.g:1188:6: lv_Pitch_10_0= RULE_INT
                    {
                    lv_Pitch_10_0=(Token)match(input,RULE_INT,FOLLOW_49); 

                    						newLeafNode(lv_Pitch_10_0, grammarAccess.getOriginAccess().getPitchINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Pitch",
                    							lv_Pitch_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1205:3: (otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1206:4: otherlv_11= 'Yaw' ( (lv_Yaw_12_0= RULE_INT ) )
                    {
                    otherlv_11=(Token)match(input,39,FOLLOW_44); 

                    				newLeafNode(otherlv_11, grammarAccess.getOriginAccess().getYawKeyword_6_0());
                    			
                    // InternalDsl.g:1210:4: ( (lv_Yaw_12_0= RULE_INT ) )
                    // InternalDsl.g:1211:5: (lv_Yaw_12_0= RULE_INT )
                    {
                    // InternalDsl.g:1211:5: (lv_Yaw_12_0= RULE_INT )
                    // InternalDsl.g:1212:6: lv_Yaw_12_0= RULE_INT
                    {
                    lv_Yaw_12_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_Yaw_12_0, grammarAccess.getOriginAccess().getYawINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOriginRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Yaw",
                    							lv_Yaw_12_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:1233:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalDsl.g:1233:45: (iv_ruleMass= ruleMass EOF )
            // InternalDsl.g:1234:2: iv_ruleMass= ruleMass EOF
            {
             newCompositeNode(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMass=ruleMass();

            state._fsp--;

             current =iv_ruleMass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalDsl.g:1240:1: ruleMass returns [EObject current=null] : ( () otherlv_1= 'Mass' ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1246:2: ( ( () otherlv_1= 'Mass' ) )
            // InternalDsl.g:1247:2: ( () otherlv_1= 'Mass' )
            {
            // InternalDsl.g:1247:2: ( () otherlv_1= 'Mass' )
            // InternalDsl.g:1248:3: () otherlv_1= 'Mass'
            {
            // InternalDsl.g:1248:3: ()
            // InternalDsl.g:1249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMassAccess().getMassAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:1263:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalDsl.g:1263:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalDsl.g:1264:2: iv_ruleInertia= ruleInertia EOF
            {
             newCompositeNode(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInertia=ruleInertia();

            state._fsp--;

             current =iv_ruleInertia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalDsl.g:1270:1: ruleInertia returns [EObject current=null] : ( () otherlv_1= 'Inertia' ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1276:2: ( ( () otherlv_1= 'Inertia' ) )
            // InternalDsl.g:1277:2: ( () otherlv_1= 'Inertia' )
            {
            // InternalDsl.g:1277:2: ( () otherlv_1= 'Inertia' )
            // InternalDsl.g:1278:3: () otherlv_1= 'Inertia'
            {
            // InternalDsl.g:1278:3: ()
            // InternalDsl.g:1279:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInertiaAccess().getInertiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getInertiaKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleMaterial_Impl"
    // InternalDsl.g:1293:1: entryRuleMaterial_Impl returns [EObject current=null] : iv_ruleMaterial_Impl= ruleMaterial_Impl EOF ;
    public final EObject entryRuleMaterial_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial_Impl = null;


        try {
            // InternalDsl.g:1293:54: (iv_ruleMaterial_Impl= ruleMaterial_Impl EOF )
            // InternalDsl.g:1294:2: iv_ruleMaterial_Impl= ruleMaterial_Impl EOF
            {
             newCompositeNode(grammarAccess.getMaterial_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial_Impl=ruleMaterial_Impl();

            state._fsp--;

             current =iv_ruleMaterial_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaterial_Impl"


    // $ANTLR start "ruleMaterial_Impl"
    // InternalDsl.g:1300:1: ruleMaterial_Impl returns [EObject current=null] : ( () otherlv_1= 'Material' ) ;
    public final EObject ruleMaterial_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1306:2: ( ( () otherlv_1= 'Material' ) )
            // InternalDsl.g:1307:2: ( () otherlv_1= 'Material' )
            {
            // InternalDsl.g:1307:2: ( () otherlv_1= 'Material' )
            // InternalDsl.g:1308:3: () otherlv_1= 'Material'
            {
            // InternalDsl.g:1308:3: ()
            // InternalDsl.g:1309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMaterial_ImplAccess().getMaterialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMaterial_ImplAccess().getMaterialKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaterial_Impl"


    // $ANTLR start "entryRuleGeometry_Impl"
    // InternalDsl.g:1323:1: entryRuleGeometry_Impl returns [EObject current=null] : iv_ruleGeometry_Impl= ruleGeometry_Impl EOF ;
    public final EObject entryRuleGeometry_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry_Impl = null;


        try {
            // InternalDsl.g:1323:54: (iv_ruleGeometry_Impl= ruleGeometry_Impl EOF )
            // InternalDsl.g:1324:2: iv_ruleGeometry_Impl= ruleGeometry_Impl EOF
            {
             newCompositeNode(grammarAccess.getGeometry_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeometry_Impl=ruleGeometry_Impl();

            state._fsp--;

             current =iv_ruleGeometry_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeometry_Impl"


    // $ANTLR start "ruleGeometry_Impl"
    // InternalDsl.g:1330:1: ruleGeometry_Impl returns [EObject current=null] : ( () otherlv_1= 'Geometry' ) ;
    public final EObject ruleGeometry_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1336:2: ( ( () otherlv_1= 'Geometry' ) )
            // InternalDsl.g:1337:2: ( () otherlv_1= 'Geometry' )
            {
            // InternalDsl.g:1337:2: ( () otherlv_1= 'Geometry' )
            // InternalDsl.g:1338:3: () otherlv_1= 'Geometry'
            {
            // InternalDsl.g:1338:3: ()
            // InternalDsl.g:1339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGeometry_ImplAccess().getGeometryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGeometry_ImplAccess().getGeometryKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeometry_Impl"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:1353:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDsl.g:1353:46: (iv_ruleColor= ruleColor EOF )
            // InternalDsl.g:1354:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDsl.g:1360:1: ruleColor returns [EObject current=null] : ( () otherlv_1= 'Color' ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1366:2: ( ( () otherlv_1= 'Color' ) )
            // InternalDsl.g:1367:2: ( () otherlv_1= 'Color' )
            {
            // InternalDsl.g:1367:2: ( () otherlv_1= 'Color' )
            // InternalDsl.g:1368:3: () otherlv_1= 'Color'
            {
            // InternalDsl.g:1368:3: ()
            // InternalDsl.g:1369:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColorAccess().getColorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getColorKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:1383:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalDsl.g:1383:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalDsl.g:1384:2: iv_ruleTexture= ruleTexture EOF
            {
             newCompositeNode(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexture=ruleTexture();

            state._fsp--;

             current =iv_ruleTexture; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalDsl.g:1390:1: ruleTexture returns [EObject current=null] : ( () otherlv_1= 'Texture' ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1396:2: ( ( () otherlv_1= 'Texture' ) )
            // InternalDsl.g:1397:2: ( () otherlv_1= 'Texture' )
            {
            // InternalDsl.g:1397:2: ( () otherlv_1= 'Texture' )
            // InternalDsl.g:1398:3: () otherlv_1= 'Texture'
            {
            // InternalDsl.g:1398:3: ()
            // InternalDsl.g:1399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTextureAccess().getTextureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTextureAccess().getTextureKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:1413:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalDsl.g:1413:44: (iv_ruleBox= ruleBox EOF )
            // InternalDsl.g:1414:2: iv_ruleBox= ruleBox EOF
            {
             newCompositeNode(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBox=ruleBox();

            state._fsp--;

             current =iv_ruleBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalDsl.g:1420:1: ruleBox returns [EObject current=null] : ( () otherlv_1= 'Box' ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1426:2: ( ( () otherlv_1= 'Box' ) )
            // InternalDsl.g:1427:2: ( () otherlv_1= 'Box' )
            {
            // InternalDsl.g:1427:2: ( () otherlv_1= 'Box' )
            // InternalDsl.g:1428:3: () otherlv_1= 'Box'
            {
            // InternalDsl.g:1428:3: ()
            // InternalDsl.g:1429:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoxAccess().getBoxAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoxAccess().getBoxKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:1443:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalDsl.g:1443:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalDsl.g:1444:2: iv_ruleCylinder= ruleCylinder EOF
            {
             newCompositeNode(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCylinder=ruleCylinder();

            state._fsp--;

             current =iv_ruleCylinder; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalDsl.g:1450:1: ruleCylinder returns [EObject current=null] : ( () otherlv_1= 'Cylinder' ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1456:2: ( ( () otherlv_1= 'Cylinder' ) )
            // InternalDsl.g:1457:2: ( () otherlv_1= 'Cylinder' )
            {
            // InternalDsl.g:1457:2: ( () otherlv_1= 'Cylinder' )
            // InternalDsl.g:1458:3: () otherlv_1= 'Cylinder'
            {
            // InternalDsl.g:1458:3: ()
            // InternalDsl.g:1459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCylinderAccess().getCylinderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCylinderAccess().getCylinderKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:1473:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalDsl.g:1473:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalDsl.g:1474:2: iv_ruleMesh= ruleMesh EOF
            {
             newCompositeNode(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMesh=ruleMesh();

            state._fsp--;

             current =iv_ruleMesh; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalDsl.g:1480:1: ruleMesh returns [EObject current=null] : ( () otherlv_1= 'Mesh' ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1486:2: ( ( () otherlv_1= 'Mesh' ) )
            // InternalDsl.g:1487:2: ( () otherlv_1= 'Mesh' )
            {
            // InternalDsl.g:1487:2: ( () otherlv_1= 'Mesh' )
            // InternalDsl.g:1488:3: () otherlv_1= 'Mesh'
            {
            // InternalDsl.g:1488:3: ()
            // InternalDsl.g:1489:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMeshAccess().getMeshAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMeshAccess().getMeshKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalDsl.g:1503:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalDsl.g:1503:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalDsl.g:1504:2: iv_ruleSphere= ruleSphere EOF
            {
             newCompositeNode(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSphere=ruleSphere();

            state._fsp--;

             current =iv_ruleSphere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalDsl.g:1510:1: ruleSphere returns [EObject current=null] : ( () otherlv_1= 'Sphere' ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1516:2: ( ( () otherlv_1= 'Sphere' ) )
            // InternalDsl.g:1517:2: ( () otherlv_1= 'Sphere' )
            {
            // InternalDsl.g:1517:2: ( () otherlv_1= 'Sphere' )
            // InternalDsl.g:1518:3: () otherlv_1= 'Sphere'
            {
            // InternalDsl.g:1518:3: ()
            // InternalDsl.g:1519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSphereAccess().getSphereAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSphereAccess().getSphereKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:1533:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDsl.g:1533:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDsl.g:1534:2: iv_ruleLimit= ruleLimit EOF
            {
             newCompositeNode(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLimit=ruleLimit();

            state._fsp--;

             current =iv_ruleLimit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDsl.g:1540:1: ruleLimit returns [EObject current=null] : ( () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Lower_2_0=null;
        Token otherlv_3=null;
        Token lv_Upper_4_0=null;
        Token otherlv_5=null;
        Token lv_Effort_6_0=null;
        Token otherlv_7=null;
        Token lv_Velocity_8_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1546:2: ( ( () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1547:2: ( () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1547:2: ( () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )? )
            // InternalDsl.g:1548:3: () (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )? (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )? (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )? (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1548:3: ()
            // InternalDsl.g:1549:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLimitAccess().getLimitAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1555:3: (otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1556:4: otherlv_1= 'Lower' ( (lv_Lower_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLowerKeyword_1_0());
                    			
                    // InternalDsl.g:1560:4: ( (lv_Lower_2_0= RULE_INT ) )
                    // InternalDsl.g:1561:5: (lv_Lower_2_0= RULE_INT )
                    {
                    // InternalDsl.g:1561:5: (lv_Lower_2_0= RULE_INT )
                    // InternalDsl.g:1562:6: lv_Lower_2_0= RULE_INT
                    {
                    lv_Lower_2_0=(Token)match(input,RULE_INT,FOLLOW_50); 

                    						newLeafNode(lv_Lower_2_0, grammarAccess.getLimitAccess().getLowerINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Lower",
                    							lv_Lower_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1579:3: (otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1580:4: otherlv_3= 'Upper' ( (lv_Upper_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getUpperKeyword_2_0());
                    			
                    // InternalDsl.g:1584:4: ( (lv_Upper_4_0= RULE_INT ) )
                    // InternalDsl.g:1585:5: (lv_Upper_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1585:5: (lv_Upper_4_0= RULE_INT )
                    // InternalDsl.g:1586:6: lv_Upper_4_0= RULE_INT
                    {
                    lv_Upper_4_0=(Token)match(input,RULE_INT,FOLLOW_51); 

                    						newLeafNode(lv_Upper_4_0, grammarAccess.getLimitAccess().getUpperINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Upper",
                    							lv_Upper_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1603:3: (otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1604:4: otherlv_5= 'Effort' ( (lv_Effort_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getEffortKeyword_3_0());
                    			
                    // InternalDsl.g:1608:4: ( (lv_Effort_6_0= RULE_INT ) )
                    // InternalDsl.g:1609:5: (lv_Effort_6_0= RULE_INT )
                    {
                    // InternalDsl.g:1609:5: (lv_Effort_6_0= RULE_INT )
                    // InternalDsl.g:1610:6: lv_Effort_6_0= RULE_INT
                    {
                    lv_Effort_6_0=(Token)match(input,RULE_INT,FOLLOW_52); 

                    						newLeafNode(lv_Effort_6_0, grammarAccess.getLimitAccess().getEffortINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Effort",
                    							lv_Effort_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1627:3: (otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1628:4: otherlv_7= 'Velocity' ( (lv_Velocity_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getVelocityKeyword_4_0());
                    			
                    // InternalDsl.g:1632:4: ( (lv_Velocity_8_0= RULE_INT ) )
                    // InternalDsl.g:1633:5: (lv_Velocity_8_0= RULE_INT )
                    {
                    // InternalDsl.g:1633:5: (lv_Velocity_8_0= RULE_INT )
                    // InternalDsl.g:1634:6: lv_Velocity_8_0= RULE_INT
                    {
                    lv_Velocity_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_Velocity_8_0, grammarAccess.getLimitAccess().getVelocityINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLimitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Velocity",
                    							lv_Velocity_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:1655:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalDsl.g:1655:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalDsl.g:1656:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalDsl.g:1662:1: ruleAxis returns [EObject current=null] : ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token otherlv_3=null;
        Token lv_y_4_0=null;
        Token otherlv_5=null;
        Token lv_z_6_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1668:2: ( ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1669:2: ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1669:2: ( () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )? )
            // InternalDsl.g:1670:3: () (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )? (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )? (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1670:3: ()
            // InternalDsl.g:1671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAxisAccess().getAxisAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1677:3: (otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1678:4: otherlv_1= 'x' ( (lv_x_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getXKeyword_1_0());
                    			
                    // InternalDsl.g:1682:4: ( (lv_x_2_0= RULE_INT ) )
                    // InternalDsl.g:1683:5: (lv_x_2_0= RULE_INT )
                    {
                    // InternalDsl.g:1683:5: (lv_x_2_0= RULE_INT )
                    // InternalDsl.g:1684:6: lv_x_2_0= RULE_INT
                    {
                    lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_53); 

                    						newLeafNode(lv_x_2_0, grammarAccess.getAxisAccess().getXINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1701:3: (otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:1702:4: otherlv_3= 'y' ( (lv_y_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getAxisAccess().getYKeyword_2_0());
                    			
                    // InternalDsl.g:1706:4: ( (lv_y_4_0= RULE_INT ) )
                    // InternalDsl.g:1707:5: (lv_y_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1707:5: (lv_y_4_0= RULE_INT )
                    // InternalDsl.g:1708:6: lv_y_4_0= RULE_INT
                    {
                    lv_y_4_0=(Token)match(input,RULE_INT,FOLLOW_54); 

                    						newLeafNode(lv_y_4_0, grammarAccess.getAxisAccess().getYINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"y",
                    							lv_y_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1725:3: (otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==36) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:1726:4: otherlv_5= 'z' ( (lv_z_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getAxisAccess().getZKeyword_3_0());
                    			
                    // InternalDsl.g:1730:4: ( (lv_z_6_0= RULE_INT ) )
                    // InternalDsl.g:1731:5: (lv_z_6_0= RULE_INT )
                    {
                    // InternalDsl.g:1731:5: (lv_z_6_0= RULE_INT )
                    // InternalDsl.g:1732:6: lv_z_6_0= RULE_INT
                    {
                    lv_z_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_z_6_0, grammarAccess.getAxisAccess().getZINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"z",
                    							lv_z_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCallibration"
    // InternalDsl.g:1753:1: entryRuleCallibration returns [EObject current=null] : iv_ruleCallibration= ruleCallibration EOF ;
    public final EObject entryRuleCallibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallibration = null;


        try {
            // InternalDsl.g:1753:53: (iv_ruleCallibration= ruleCallibration EOF )
            // InternalDsl.g:1754:2: iv_ruleCallibration= ruleCallibration EOF
            {
             newCompositeNode(grammarAccess.getCallibrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallibration=ruleCallibration();

            state._fsp--;

             current =iv_ruleCallibration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallibration"


    // $ANTLR start "ruleCallibration"
    // InternalDsl.g:1760:1: ruleCallibration returns [EObject current=null] : ( () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleCallibration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Rising_2_0=null;
        Token otherlv_3=null;
        Token lv_Falling_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1766:2: ( ( () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )? ) )
            // InternalDsl.g:1767:2: ( () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:1767:2: ( () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )? )
            // InternalDsl.g:1768:3: () (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )? (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )?
            {
            // InternalDsl.g:1768:3: ()
            // InternalDsl.g:1769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCallibrationAccess().getCallibrationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1775:3: (otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:1776:4: otherlv_1= 'Rising' ( (lv_Rising_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getCallibrationAccess().getRisingKeyword_1_0());
                    			
                    // InternalDsl.g:1780:4: ( (lv_Rising_2_0= RULE_STRING ) )
                    // InternalDsl.g:1781:5: (lv_Rising_2_0= RULE_STRING )
                    {
                    // InternalDsl.g:1781:5: (lv_Rising_2_0= RULE_STRING )
                    // InternalDsl.g:1782:6: lv_Rising_2_0= RULE_STRING
                    {
                    lv_Rising_2_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    						newLeafNode(lv_Rising_2_0, grammarAccess.getCallibrationAccess().getRisingSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallibrationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Rising",
                    							lv_Rising_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1799:3: (otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==55) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:1800:4: otherlv_3= 'Falling' ( (lv_Falling_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCallibrationAccess().getFallingKeyword_2_0());
                    			
                    // InternalDsl.g:1804:4: ( (lv_Falling_4_0= RULE_STRING ) )
                    // InternalDsl.g:1805:5: (lv_Falling_4_0= RULE_STRING )
                    {
                    // InternalDsl.g:1805:5: (lv_Falling_4_0= RULE_STRING )
                    // InternalDsl.g:1806:6: lv_Falling_4_0= RULE_STRING
                    {
                    lv_Falling_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_Falling_4_0, grammarAccess.getCallibrationAccess().getFallingSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallibrationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Falling",
                    							lv_Falling_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:1827:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalDsl.g:1827:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalDsl.g:1828:2: iv_ruleDynamics= ruleDynamics EOF
            {
             newCompositeNode(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamics=ruleDynamics();

            state._fsp--;

             current =iv_ruleDynamics; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalDsl.g:1834:1: ruleDynamics returns [EObject current=null] : ( () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )? ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Friction_2_0=null;
        Token otherlv_3=null;
        Token lv_Damping_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1840:2: ( ( () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1841:2: ( () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1841:2: ( () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )? )
            // InternalDsl.g:1842:3: () (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )? (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1842:3: ()
            // InternalDsl.g:1843:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1849:3: (otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:1850:4: otherlv_1= 'Friction' ( (lv_Friction_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getDynamicsAccess().getFrictionKeyword_1_0());
                    			
                    // InternalDsl.g:1854:4: ( (lv_Friction_2_0= RULE_INT ) )
                    // InternalDsl.g:1855:5: (lv_Friction_2_0= RULE_INT )
                    {
                    // InternalDsl.g:1855:5: (lv_Friction_2_0= RULE_INT )
                    // InternalDsl.g:1856:6: lv_Friction_2_0= RULE_INT
                    {
                    lv_Friction_2_0=(Token)match(input,RULE_INT,FOLLOW_56); 

                    						newLeafNode(lv_Friction_2_0, grammarAccess.getDynamicsAccess().getFrictionINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Friction",
                    							lv_Friction_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1873:3: (otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:1874:4: otherlv_3= 'Damping' ( (lv_Damping_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getDynamicsAccess().getDampingKeyword_2_0());
                    			
                    // InternalDsl.g:1878:4: ( (lv_Damping_4_0= RULE_INT ) )
                    // InternalDsl.g:1879:5: (lv_Damping_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1879:5: (lv_Damping_4_0= RULE_INT )
                    // InternalDsl.g:1880:6: lv_Damping_4_0= RULE_INT
                    {
                    lv_Damping_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_Damping_4_0, grammarAccess.getDynamicsAccess().getDampingINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDynamicsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Damping",
                    							lv_Damping_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleMimic"
    // InternalDsl.g:1901:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalDsl.g:1901:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalDsl.g:1902:2: iv_ruleMimic= ruleMimic EOF
            {
             newCompositeNode(grammarAccess.getMimicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMimic=ruleMimic();

            state._fsp--;

             current =iv_ruleMimic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMimic"


    // $ANTLR start "ruleMimic"
    // InternalDsl.g:1908:1: ruleMimic returns [EObject current=null] : ( () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )? ) ;
    public final EObject ruleMimic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_Joint_2_0=null;
        Token otherlv_3=null;
        Token lv_Multiplier_4_0=null;
        Token otherlv_5=null;
        Token lv_OffSet_6_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1914:2: ( ( () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:1915:2: ( () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:1915:2: ( () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )? )
            // InternalDsl.g:1916:3: () (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )? (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )? (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:1916:3: ()
            // InternalDsl.g:1917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMimicAccess().getMimicAction_0(),
            					current);
            			

            }

            // InternalDsl.g:1923:3: (otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==17) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_STRING) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:1924:4: otherlv_1= 'Joint' ( (lv_Joint_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getJointKeyword_1_0());
                    			
                    // InternalDsl.g:1928:4: ( (lv_Joint_2_0= RULE_STRING ) )
                    // InternalDsl.g:1929:5: (lv_Joint_2_0= RULE_STRING )
                    {
                    // InternalDsl.g:1929:5: (lv_Joint_2_0= RULE_STRING )
                    // InternalDsl.g:1930:6: lv_Joint_2_0= RULE_STRING
                    {
                    lv_Joint_2_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

                    						newLeafNode(lv_Joint_2_0, grammarAccess.getMimicAccess().getJointSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMimicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Joint",
                    							lv_Joint_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1947:3: (otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==58) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:1948:4: otherlv_3= 'Multiplier' ( (lv_Multiplier_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getMimicAccess().getMultiplierKeyword_2_0());
                    			
                    // InternalDsl.g:1952:4: ( (lv_Multiplier_4_0= RULE_INT ) )
                    // InternalDsl.g:1953:5: (lv_Multiplier_4_0= RULE_INT )
                    {
                    // InternalDsl.g:1953:5: (lv_Multiplier_4_0= RULE_INT )
                    // InternalDsl.g:1954:6: lv_Multiplier_4_0= RULE_INT
                    {
                    lv_Multiplier_4_0=(Token)match(input,RULE_INT,FOLLOW_58); 

                    						newLeafNode(lv_Multiplier_4_0, grammarAccess.getMimicAccess().getMultiplierINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMimicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Multiplier",
                    							lv_Multiplier_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:1971:3: (otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==59) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:1972:4: otherlv_5= 'OffSet' ( (lv_OffSet_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getMimicAccess().getOffSetKeyword_3_0());
                    			
                    // InternalDsl.g:1976:4: ( (lv_OffSet_6_0= RULE_INT ) )
                    // InternalDsl.g:1977:5: (lv_OffSet_6_0= RULE_INT )
                    {
                    // InternalDsl.g:1977:5: (lv_OffSet_6_0= RULE_INT )
                    // InternalDsl.g:1978:6: lv_OffSet_6_0= RULE_INT
                    {
                    lv_OffSet_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_OffSet_6_0, grammarAccess.getMimicAccess().getOffSetINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMimicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"OffSet",
                    							lv_OffSet_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:1999:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalDsl.g:1999:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalDsl.g:2000:2: iv_ruleSafetyController= ruleSafetyController EOF
            {
             newCompositeNode(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSafetyController=ruleSafetyController();

            state._fsp--;

             current =iv_ruleSafetyController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalDsl.g:2006:1: ruleSafetyController returns [EObject current=null] : ( () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_SoftLowerLimit_2_0=null;
        Token otherlv_3=null;
        Token lv_SoftUpperLimit_4_0=null;
        Token otherlv_5=null;
        Token lv_k_position_6_0=null;
        Token otherlv_7=null;
        Token lv_k_velocity_8_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2012:2: ( ( () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )? ) )
            // InternalDsl.g:2013:2: ( () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )? )
            {
            // InternalDsl.g:2013:2: ( () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )? )
            // InternalDsl.g:2014:3: () (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )? (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )? (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )?
            {
            // InternalDsl.g:2014:3: ()
            // InternalDsl.g:2015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSafetyControllerAccess().getSafetyControllerAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2021:3: (otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==60) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2022:4: otherlv_1= 'SoftLowerLimit' ( (lv_SoftLowerLimit_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0());
                    			
                    // InternalDsl.g:2026:4: ( (lv_SoftLowerLimit_2_0= RULE_INT ) )
                    // InternalDsl.g:2027:5: (lv_SoftLowerLimit_2_0= RULE_INT )
                    {
                    // InternalDsl.g:2027:5: (lv_SoftLowerLimit_2_0= RULE_INT )
                    // InternalDsl.g:2028:6: lv_SoftLowerLimit_2_0= RULE_INT
                    {
                    lv_SoftLowerLimit_2_0=(Token)match(input,RULE_INT,FOLLOW_59); 

                    						newLeafNode(lv_SoftLowerLimit_2_0, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyControllerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"SoftLowerLimit",
                    							lv_SoftLowerLimit_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2045:3: (otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==61) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2046:4: otherlv_3= 'SoftUpperLimit' ( (lv_SoftUpperLimit_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_44); 

                    				newLeafNode(otherlv_3, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0());
                    			
                    // InternalDsl.g:2050:4: ( (lv_SoftUpperLimit_4_0= RULE_INT ) )
                    // InternalDsl.g:2051:5: (lv_SoftUpperLimit_4_0= RULE_INT )
                    {
                    // InternalDsl.g:2051:5: (lv_SoftUpperLimit_4_0= RULE_INT )
                    // InternalDsl.g:2052:6: lv_SoftUpperLimit_4_0= RULE_INT
                    {
                    lv_SoftUpperLimit_4_0=(Token)match(input,RULE_INT,FOLLOW_60); 

                    						newLeafNode(lv_SoftUpperLimit_4_0, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyControllerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"SoftUpperLimit",
                    							lv_SoftUpperLimit_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2069:3: (otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==62) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2070:4: otherlv_5= 'k_position' ( (lv_k_position_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0());
                    			
                    // InternalDsl.g:2074:4: ( (lv_k_position_6_0= RULE_INT ) )
                    // InternalDsl.g:2075:5: (lv_k_position_6_0= RULE_INT )
                    {
                    // InternalDsl.g:2075:5: (lv_k_position_6_0= RULE_INT )
                    // InternalDsl.g:2076:6: lv_k_position_6_0= RULE_INT
                    {
                    lv_k_position_6_0=(Token)match(input,RULE_INT,FOLLOW_61); 

                    						newLeafNode(lv_k_position_6_0, grammarAccess.getSafetyControllerAccess().getK_positionINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyControllerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"k_position",
                    							lv_k_position_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2093:3: (otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==63) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:2094:4: otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,63,FOLLOW_44); 

                    				newLeafNode(otherlv_7, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4_0());
                    			
                    // InternalDsl.g:2098:4: ( (lv_k_velocity_8_0= RULE_INT ) )
                    // InternalDsl.g:2099:5: (lv_k_velocity_8_0= RULE_INT )
                    {
                    // InternalDsl.g:2099:5: (lv_k_velocity_8_0= RULE_INT )
                    // InternalDsl.g:2100:6: lv_k_velocity_8_0= RULE_INT
                    {
                    lv_k_velocity_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_k_velocity_8_0, grammarAccess.getSafetyControllerAccess().getK_velocityINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSafetyControllerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"k_velocity",
                    							lv_k_velocity_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:2121:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:2127:2: ( ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) )
            // InternalDsl.g:2128:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            {
            // InternalDsl.g:2128:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt49=1;
                }
                break;
            case 65:
                {
                alt49=2;
                }
                break;
            case 66:
                {
                alt49=3;
                }
                break;
            case 67:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2129:3: (enumLiteral_0= 'Revolute' )
                    {
                    // InternalDsl.g:2129:3: (enumLiteral_0= 'Revolute' )
                    // InternalDsl.g:2130:4: enumLiteral_0= 'Revolute'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2137:3: (enumLiteral_1= 'Continous' )
                    {
                    // InternalDsl.g:2137:3: (enumLiteral_1= 'Continous' )
                    // InternalDsl.g:2138:4: enumLiteral_1= 'Continous'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2145:3: (enumLiteral_2= 'Fixed' )
                    {
                    // InternalDsl.g:2145:3: (enumLiteral_2= 'Fixed' )
                    // InternalDsl.g:2146:4: enumLiteral_2= 'Fixed'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:2153:3: (enumLiteral_3= 'Prismatic' )
                    {
                    // InternalDsl.g:2153:3: (enumLiteral_3= 'Prismatic' )
                    // InternalDsl.g:2154:4: enumLiteral_3= 'Prismatic'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJointType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002018002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000102010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x003C000003000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001C02000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000FC3C000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00C0000038000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0300000030000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0C00000020020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000FCC0000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000080001002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000340000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000FE00000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0003C80000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000FC00000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0038000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xE000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000000000000002L});

}