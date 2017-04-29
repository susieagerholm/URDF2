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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Robot'", "'Link'", "'Collision'", "'Joint'", "'Type'", "'ChildOf'", "'ParentOf'", "'Limit'", "'Axis'", "'Origin'", "'Calibration'", "'Dynamics'", "'Mimic'", "'SafetyController'", "'Inertial'", "'Inertia'", "'Mass'", "'Visual'", "'Geometry'", "'Material'", "'xyz'", "'roll_pitch_yaw'", "'massValueInKilograms'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Color'", "'red_green_blue_alpha'", "'red'", "'green'", "'blue'", "'alpha'", "'Texture'", "'pathToFile'", "'Box'", "'height_length_width'", "'height'", "'length'", "'width'", "'Cylinder'", "'radius'", "'Mesh'", "'scale'", "'Sphere'", "'lower'", "'upper'", "'effort'", "'velocity'", "'x'", "'y'", "'z'", "'rising'", "'falling'", "'friction'", "'damping'", "'mimics'", "'multiplier'", "'offSet'", "'softLowerLimit'", "'softUpperLimit'", "'k_position'", "'k_velocity'", "'.'", "'Revolute'", "'Continous'", "'Fixed'", "'Prismatic'"
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
    public static final int RULE_ID=4;
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
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
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
    // InternalDsl.g:72:1: ruleRobot returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )* ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_link_2_0 = null;

        EObject lv_joint_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )* ) )
            // InternalDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )* )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )* )
            // InternalDsl.g:80:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) ( (lv_link_2_0= ruleLink ) )+ ( (lv_joint_3_0= ruleJoint ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotAccess().getRobotKeyword_0());
            		
            // InternalDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:102:3: ( (lv_link_2_0= ruleLink ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
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
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalDsl.g:121:3: ( (lv_joint_3_0= ruleJoint ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:122:4: (lv_joint_3_0= ruleJoint )
            	    {
            	    // InternalDsl.g:122:4: (lv_joint_3_0= ruleJoint )
            	    // InternalDsl.g:123:5: lv_joint_3_0= ruleJoint
            	    {

            	    					newCompositeNode(grammarAccess.getRobotAccess().getJointJointParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_joint_3_0=ruleJoint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRobotRule());
            	    					}
            	    					add(
            	    						current,
            	    						"joint",
            	    						lv_joint_3_0,
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
    // InternalDsl.g:144:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalDsl.g:144:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalDsl.g:145:2: iv_ruleMaterial= ruleMaterial EOF
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
    // InternalDsl.g:151:1: ruleMaterial returns [EObject current=null] : (this_Color_0= ruleColor | this_Texture_1= ruleTexture ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        EObject this_Color_0 = null;

        EObject this_Texture_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:157:2: ( (this_Color_0= ruleColor | this_Texture_1= ruleTexture ) )
            // InternalDsl.g:158:2: (this_Color_0= ruleColor | this_Texture_1= ruleTexture )
            {
            // InternalDsl.g:158:2: (this_Color_0= ruleColor | this_Texture_1= ruleTexture )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==40||LA3_0==42) ) {
                alt3=1;
            }
            else if ( (LA3_0==46) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:159:3: this_Color_0= ruleColor
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getColorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Color_0=ruleColor();

                    state._fsp--;


                    			current = this_Color_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:168:3: this_Texture_1= ruleTexture
                    {

                    			newCompositeNode(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Texture_1=ruleTexture();

                    state._fsp--;


                    			current = this_Texture_1;
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
    // InternalDsl.g:180:1: entryRuleGeometry returns [EObject current=null] : iv_ruleGeometry= ruleGeometry EOF ;
    public final EObject entryRuleGeometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeometry = null;


        try {
            // InternalDsl.g:180:49: (iv_ruleGeometry= ruleGeometry EOF )
            // InternalDsl.g:181:2: iv_ruleGeometry= ruleGeometry EOF
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
    // InternalDsl.g:187:1: ruleGeometry returns [EObject current=null] : (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) ;
    public final EObject ruleGeometry() throws RecognitionException {
        EObject current = null;

        EObject this_Box_0 = null;

        EObject this_Cylinder_1 = null;

        EObject this_Mesh_2 = null;

        EObject this_Sphere_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:193:2: ( (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere ) )
            // InternalDsl.g:194:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            {
            // InternalDsl.g:194:2: (this_Box_0= ruleBox | this_Cylinder_1= ruleCylinder | this_Mesh_2= ruleMesh | this_Sphere_3= ruleSphere )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 48:
            case 50:
                {
                alt4=1;
                }
                break;
            case 53:
                {
                alt4=2;
                }
                break;
            case 55:
                {
                alt4=3;
                }
                break;
            case 57:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:195:3: this_Box_0= ruleBox
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Box_0=ruleBox();

                    state._fsp--;


                    			current = this_Box_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:204:3: this_Cylinder_1= ruleCylinder
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cylinder_1=ruleCylinder();

                    state._fsp--;


                    			current = this_Cylinder_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:213:3: this_Mesh_2= ruleMesh
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mesh_2=ruleMesh();

                    state._fsp--;


                    			current = this_Mesh_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDsl.g:222:3: this_Sphere_3= ruleSphere
                    {

                    			newCompositeNode(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sphere_3=ruleSphere();

                    state._fsp--;


                    			current = this_Sphere_3;
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
    // InternalDsl.g:234:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalDsl.g:234:45: (iv_ruleLink= ruleLink EOF )
            // InternalDsl.g:235:2: iv_ruleLink= ruleLink EOF
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
    // InternalDsl.g:241:1: ruleLink returns [EObject current=null] : ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_visuals_3_0= ruleVisual ) )* ( (lv_inertial_4_0= ruleInertial ) )* (otherlv_5= 'Collision' ( (lv_collision_6_0= ruleCollision ) )* )? ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        EObject lv_visuals_3_0 = null;

        EObject lv_inertial_4_0 = null;

        EObject lv_collision_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:247:2: ( ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_visuals_3_0= ruleVisual ) )* ( (lv_inertial_4_0= ruleInertial ) )* (otherlv_5= 'Collision' ( (lv_collision_6_0= ruleCollision ) )* )? ) )
            // InternalDsl.g:248:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_visuals_3_0= ruleVisual ) )* ( (lv_inertial_4_0= ruleInertial ) )* (otherlv_5= 'Collision' ( (lv_collision_6_0= ruleCollision ) )* )? )
            {
            // InternalDsl.g:248:2: ( () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_visuals_3_0= ruleVisual ) )* ( (lv_inertial_4_0= ruleInertial ) )* (otherlv_5= 'Collision' ( (lv_collision_6_0= ruleCollision ) )* )? )
            // InternalDsl.g:249:3: () otherlv_1= 'Link' ( (lv_name_2_0= RULE_ID ) ) ( (lv_visuals_3_0= ruleVisual ) )* ( (lv_inertial_4_0= ruleInertial ) )* (otherlv_5= 'Collision' ( (lv_collision_6_0= ruleCollision ) )* )?
            {
            // InternalDsl.g:249:3: ()
            // InternalDsl.g:250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLinkAccess().getLinkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkAccess().getLinkKeyword_1());
            		
            // InternalDsl.g:260:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:261:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:261:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:262:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            // InternalDsl.g:278:3: ( (lv_visuals_3_0= ruleVisual ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:279:4: (lv_visuals_3_0= ruleVisual )
            	    {
            	    // InternalDsl.g:279:4: (lv_visuals_3_0= ruleVisual )
            	    // InternalDsl.g:280:5: lv_visuals_3_0= ruleVisual
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_visuals_3_0=ruleVisual();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"visuals",
            	    						lv_visuals_3_0,
            	    						"org.xtext.urdf.Dsl.Visual");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalDsl.g:297:3: ( (lv_inertial_4_0= ruleInertial ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:298:4: (lv_inertial_4_0= ruleInertial )
            	    {
            	    // InternalDsl.g:298:4: (lv_inertial_4_0= ruleInertial )
            	    // InternalDsl.g:299:5: lv_inertial_4_0= ruleInertial
            	    {

            	    					newCompositeNode(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalDsl.g:316:3: (otherlv_5= 'Collision' ( (lv_collision_6_0= ruleCollision ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:317:4: otherlv_5= 'Collision' ( (lv_collision_6_0= ruleCollision ) )*
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getCollisionKeyword_5_0());
                    			
                    // InternalDsl.g:321:4: ( (lv_collision_6_0= ruleCollision ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ID) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:322:5: (lv_collision_6_0= ruleCollision )
                    	    {
                    	    // InternalDsl.g:322:5: (lv_collision_6_0= ruleCollision )
                    	    // InternalDsl.g:323:6: lv_collision_6_0= ruleCollision
                    	    {

                    	    						newCompositeNode(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_collision_6_0=ruleCollision();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLinkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"collision",
                    	    							lv_collision_6_0,
                    	    							"org.xtext.urdf.Dsl.Collision");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
    // InternalDsl.g:345:1: entryRuleJoint returns [EObject current=null] : iv_ruleJoint= ruleJoint EOF ;
    public final EObject entryRuleJoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoint = null;


        try {
            // InternalDsl.g:345:46: (iv_ruleJoint= ruleJoint EOF )
            // InternalDsl.g:346:2: iv_ruleJoint= ruleJoint EOF
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
    // InternalDsl.g:352:1: ruleJoint returns [EObject current=null] : (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? (otherlv_12= 'Origin' ( (lv_origin_13_0= ruleOrigin ) ) )? (otherlv_14= 'Calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'Dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'Mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'SafetyController' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )? ) ;
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
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Enumerator lv_Type_3_0 = null;

        EObject lv_limit_9_0 = null;

        EObject lv_axis_11_0 = null;

        EObject lv_origin_13_0 = null;

        EObject lv_calibration_15_0 = null;

        EObject lv_dynamics_17_0 = null;

        EObject lv_mimic_19_0 = null;

        EObject lv_safetycontroller_21_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:358:2: ( (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? (otherlv_12= 'Origin' ( (lv_origin_13_0= ruleOrigin ) ) )? (otherlv_14= 'Calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'Dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'Mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'SafetyController' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )? ) )
            // InternalDsl.g:359:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? (otherlv_12= 'Origin' ( (lv_origin_13_0= ruleOrigin ) ) )? (otherlv_14= 'Calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'Dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'Mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'SafetyController' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )? )
            {
            // InternalDsl.g:359:2: (otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? (otherlv_12= 'Origin' ( (lv_origin_13_0= ruleOrigin ) ) )? (otherlv_14= 'Calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'Dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'Mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'SafetyController' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )? )
            // InternalDsl.g:360:3: otherlv_0= 'Joint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Type' ( (lv_Type_3_0= ruleJointType ) ) otherlv_4= 'ChildOf' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'ParentOf' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )? (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )? (otherlv_12= 'Origin' ( (lv_origin_13_0= ruleOrigin ) ) )? (otherlv_14= 'Calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )? (otherlv_16= 'Dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )? (otherlv_18= 'Mimic' ( (lv_mimic_19_0= ruleMimic ) ) )? (otherlv_20= 'SafetyController' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJointAccess().getJointKeyword_0());
            		
            // InternalDsl.g:364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:365:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getJointAccess().getTypeKeyword_2());
            		
            // InternalDsl.g:386:3: ( (lv_Type_3_0= ruleJointType ) )
            // InternalDsl.g:387:4: (lv_Type_3_0= ruleJointType )
            {
            // InternalDsl.g:387:4: (lv_Type_3_0= ruleJointType )
            // InternalDsl.g:388:5: lv_Type_3_0= ruleJointType
            {

            					newCompositeNode(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getJointAccess().getChildOfKeyword_4());
            		
            // InternalDsl.g:409:3: ( (otherlv_5= RULE_ID ) )
            // InternalDsl.g:410:4: (otherlv_5= RULE_ID )
            {
            // InternalDsl.g:410:4: (otherlv_5= RULE_ID )
            // InternalDsl.g:411:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getJointAccess().getParentOfKeyword_6());
            		
            // InternalDsl.g:426:3: ( (otherlv_7= RULE_ID ) )
            // InternalDsl.g:427:4: (otherlv_7= RULE_ID )
            {
            // InternalDsl.g:427:4: (otherlv_7= RULE_ID )
            // InternalDsl.g:428:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJointRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_7, grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0());
            				

            }


            }

            // InternalDsl.g:439:3: (otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:440:4: otherlv_8= 'Limit' ( (lv_limit_9_0= ruleLimit ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getJointAccess().getLimitKeyword_8_0());
                    			
                    // InternalDsl.g:444:4: ( (lv_limit_9_0= ruleLimit ) )
                    // InternalDsl.g:445:5: (lv_limit_9_0= ruleLimit )
                    {
                    // InternalDsl.g:445:5: (lv_limit_9_0= ruleLimit )
                    // InternalDsl.g:446:6: lv_limit_9_0= ruleLimit
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_limit_9_0=ruleLimit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"limit",
                    							lv_limit_9_0,
                    							"org.xtext.urdf.Dsl.Limit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:464:3: (otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:465:4: otherlv_10= 'Axis' ( (lv_axis_11_0= ruleAxis ) )
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getJointAccess().getAxisKeyword_9_0());
                    			
                    // InternalDsl.g:469:4: ( (lv_axis_11_0= ruleAxis ) )
                    // InternalDsl.g:470:5: (lv_axis_11_0= ruleAxis )
                    {
                    // InternalDsl.g:470:5: (lv_axis_11_0= ruleAxis )
                    // InternalDsl.g:471:6: lv_axis_11_0= ruleAxis
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_axis_11_0=ruleAxis();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"axis",
                    							lv_axis_11_0,
                    							"org.xtext.urdf.Dsl.Axis");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:489:3: (otherlv_12= 'Origin' ( (lv_origin_13_0= ruleOrigin ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:490:4: otherlv_12= 'Origin' ( (lv_origin_13_0= ruleOrigin ) )
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getJointAccess().getOriginKeyword_10_0());
                    			
                    // InternalDsl.g:494:4: ( (lv_origin_13_0= ruleOrigin ) )
                    // InternalDsl.g:495:5: (lv_origin_13_0= ruleOrigin )
                    {
                    // InternalDsl.g:495:5: (lv_origin_13_0= ruleOrigin )
                    // InternalDsl.g:496:6: lv_origin_13_0= ruleOrigin
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_origin_13_0=ruleOrigin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_13_0,
                    							"org.xtext.urdf.Dsl.Origin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:514:3: (otherlv_14= 'Calibration' ( (lv_calibration_15_0= ruleCalibration ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:515:4: otherlv_14= 'Calibration' ( (lv_calibration_15_0= ruleCalibration ) )
                    {
                    otherlv_14=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getJointAccess().getCalibrationKeyword_11_0());
                    			
                    // InternalDsl.g:519:4: ( (lv_calibration_15_0= ruleCalibration ) )
                    // InternalDsl.g:520:5: (lv_calibration_15_0= ruleCalibration )
                    {
                    // InternalDsl.g:520:5: (lv_calibration_15_0= ruleCalibration )
                    // InternalDsl.g:521:6: lv_calibration_15_0= ruleCalibration
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_calibration_15_0=ruleCalibration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"calibration",
                    							lv_calibration_15_0,
                    							"org.xtext.urdf.Dsl.Calibration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:539:3: (otherlv_16= 'Dynamics' ( (lv_dynamics_17_0= ruleDynamics ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:540:4: otherlv_16= 'Dynamics' ( (lv_dynamics_17_0= ruleDynamics ) )
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getJointAccess().getDynamicsKeyword_12_0());
                    			
                    // InternalDsl.g:544:4: ( (lv_dynamics_17_0= ruleDynamics ) )
                    // InternalDsl.g:545:5: (lv_dynamics_17_0= ruleDynamics )
                    {
                    // InternalDsl.g:545:5: (lv_dynamics_17_0= ruleDynamics )
                    // InternalDsl.g:546:6: lv_dynamics_17_0= ruleDynamics
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_dynamics_17_0=ruleDynamics();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"dynamics",
                    							lv_dynamics_17_0,
                    							"org.xtext.urdf.Dsl.Dynamics");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:564:3: (otherlv_18= 'Mimic' ( (lv_mimic_19_0= ruleMimic ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:565:4: otherlv_18= 'Mimic' ( (lv_mimic_19_0= ruleMimic ) )
                    {
                    otherlv_18=(Token)match(input,23,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getJointAccess().getMimicKeyword_13_0());
                    			
                    // InternalDsl.g:569:4: ( (lv_mimic_19_0= ruleMimic ) )
                    // InternalDsl.g:570:5: (lv_mimic_19_0= ruleMimic )
                    {
                    // InternalDsl.g:570:5: (lv_mimic_19_0= ruleMimic )
                    // InternalDsl.g:571:6: lv_mimic_19_0= ruleMimic
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_mimic_19_0=ruleMimic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"mimic",
                    							lv_mimic_19_0,
                    							"org.xtext.urdf.Dsl.Mimic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:589:3: (otherlv_20= 'SafetyController' ( (lv_safetycontroller_21_0= ruleSafetyController ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:590:4: otherlv_20= 'SafetyController' ( (lv_safetycontroller_21_0= ruleSafetyController ) )
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_20, grammarAccess.getJointAccess().getSafetyControllerKeyword_14_0());
                    			
                    // InternalDsl.g:594:4: ( (lv_safetycontroller_21_0= ruleSafetyController ) )
                    // InternalDsl.g:595:5: (lv_safetycontroller_21_0= ruleSafetyController )
                    {
                    // InternalDsl.g:595:5: (lv_safetycontroller_21_0= ruleSafetyController )
                    // InternalDsl.g:596:6: lv_safetycontroller_21_0= ruleSafetyController
                    {

                    						newCompositeNode(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_safetycontroller_21_0=ruleSafetyController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJointRule());
                    						}
                    						set(
                    							current,
                    							"safetycontroller",
                    							lv_safetycontroller_21_0,
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
    // InternalDsl.g:618:1: entryRuleInertial returns [EObject current=null] : iv_ruleInertial= ruleInertial EOF ;
    public final EObject entryRuleInertial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertial = null;


        try {
            // InternalDsl.g:618:49: (iv_ruleInertial= ruleInertial EOF )
            // InternalDsl.g:619:2: iv_ruleInertial= ruleInertial EOF
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
    // InternalDsl.g:625:1: ruleInertial returns [EObject current=null] : (otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Inertia' ( (lv_inertia_3_0= ruleInertia ) ) otherlv_4= 'Mass' ( (lv_mass_5_0= ruleMass ) ) ( (lv_origin_6_0= ruleOrigin ) )? ) ;
    public final EObject ruleInertial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_inertia_3_0 = null;

        EObject lv_mass_5_0 = null;

        EObject lv_origin_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:631:2: ( (otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Inertia' ( (lv_inertia_3_0= ruleInertia ) ) otherlv_4= 'Mass' ( (lv_mass_5_0= ruleMass ) ) ( (lv_origin_6_0= ruleOrigin ) )? ) )
            // InternalDsl.g:632:2: (otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Inertia' ( (lv_inertia_3_0= ruleInertia ) ) otherlv_4= 'Mass' ( (lv_mass_5_0= ruleMass ) ) ( (lv_origin_6_0= ruleOrigin ) )? )
            {
            // InternalDsl.g:632:2: (otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Inertia' ( (lv_inertia_3_0= ruleInertia ) ) otherlv_4= 'Mass' ( (lv_mass_5_0= ruleMass ) ) ( (lv_origin_6_0= ruleOrigin ) )? )
            // InternalDsl.g:633:3: otherlv_0= 'Inertial' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Inertia' ( (lv_inertia_3_0= ruleInertia ) ) otherlv_4= 'Mass' ( (lv_mass_5_0= ruleMass ) ) ( (lv_origin_6_0= ruleOrigin ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getInertialAccess().getInertialKeyword_0());
            		
            // InternalDsl.g:637:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:638:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:638:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:639:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertialRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getInertialAccess().getInertiaKeyword_2());
            		
            // InternalDsl.g:659:3: ( (lv_inertia_3_0= ruleInertia ) )
            // InternalDsl.g:660:4: (lv_inertia_3_0= ruleInertia )
            {
            // InternalDsl.g:660:4: (lv_inertia_3_0= ruleInertia )
            // InternalDsl.g:661:5: lv_inertia_3_0= ruleInertia
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_31);
            lv_inertia_3_0=ruleInertia();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"inertia",
            						lv_inertia_3_0,
            						"org.xtext.urdf.Dsl.Inertia");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getInertialAccess().getMassKeyword_4());
            		
            // InternalDsl.g:682:3: ( (lv_mass_5_0= ruleMass ) )
            // InternalDsl.g:683:4: (lv_mass_5_0= ruleMass )
            {
            // InternalDsl.g:683:4: (lv_mass_5_0= ruleMass )
            // InternalDsl.g:684:5: lv_mass_5_0= ruleMass
            {

            					newCompositeNode(grammarAccess.getInertialAccess().getMassMassParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_33);
            lv_mass_5_0=ruleMass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertialRule());
            					}
            					set(
            						current,
            						"mass",
            						lv_mass_5_0,
            						"org.xtext.urdf.Dsl.Mass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:701:3: ( (lv_origin_6_0= ruleOrigin ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:702:4: (lv_origin_6_0= ruleOrigin )
                    {
                    // InternalDsl.g:702:4: (lv_origin_6_0= ruleOrigin )
                    // InternalDsl.g:703:5: lv_origin_6_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_origin_6_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInertialRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_6_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:724:1: entryRuleVisual returns [EObject current=null] : iv_ruleVisual= ruleVisual EOF ;
    public final EObject entryRuleVisual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisual = null;


        try {
            // InternalDsl.g:724:47: (iv_ruleVisual= ruleVisual EOF )
            // InternalDsl.g:725:2: iv_ruleVisual= ruleVisual EOF
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
    // InternalDsl.g:731:1: ruleVisual returns [EObject current=null] : (otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )? ) ;
    public final EObject ruleVisual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_geometry_3_0 = null;

        EObject lv_origin_4_0 = null;

        EObject lv_material_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:737:2: ( (otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )? ) )
            // InternalDsl.g:738:2: (otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )? )
            {
            // InternalDsl.g:738:2: (otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )? )
            // InternalDsl.g:739:3: otherlv_0= 'Visual' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'Geometry' ( (lv_geometry_3_0= ruleGeometry ) ) ( (lv_origin_4_0= ruleOrigin ) )? (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getVisualAccess().getVisualKeyword_0());
            		
            // InternalDsl.g:743:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:744:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:744:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:745:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVisualRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,29,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getVisualAccess().getGeometryKeyword_2());
            		
            // InternalDsl.g:765:3: ( (lv_geometry_3_0= ruleGeometry ) )
            // InternalDsl.g:766:4: (lv_geometry_3_0= ruleGeometry )
            {
            // InternalDsl.g:766:4: (lv_geometry_3_0= ruleGeometry )
            // InternalDsl.g:767:5: lv_geometry_3_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_geometry_3_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVisualRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_3_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:784:3: ( (lv_origin_4_0= ruleOrigin ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:785:4: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalDsl.g:785:4: (lv_origin_4_0= ruleOrigin )
                    // InternalDsl.g:786:5: lv_origin_4_0= ruleOrigin
                    {

                    					newCompositeNode(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_origin_4_0=ruleOrigin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVisualRule());
                    					}
                    					set(
                    						current,
                    						"origin",
                    						lv_origin_4_0,
                    						"org.xtext.urdf.Dsl.Origin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:803:3: (otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:804:4: otherlv_5= 'Material' ( (lv_material_6_0= ruleMaterial ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_39); 

                    				newLeafNode(otherlv_5, grammarAccess.getVisualAccess().getMaterialKeyword_5_0());
                    			
                    // InternalDsl.g:808:4: ( (lv_material_6_0= ruleMaterial ) )
                    // InternalDsl.g:809:5: (lv_material_6_0= ruleMaterial )
                    {
                    // InternalDsl.g:809:5: (lv_material_6_0= ruleMaterial )
                    // InternalDsl.g:810:6: lv_material_6_0= ruleMaterial
                    {

                    						newCompositeNode(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_material_6_0=ruleMaterial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVisualRule());
                    						}
                    						set(
                    							current,
                    							"material",
                    							lv_material_6_0,
                    							"org.xtext.urdf.Dsl.Material");
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
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:832:1: entryRuleCollision returns [EObject current=null] : iv_ruleCollision= ruleCollision EOF ;
    public final EObject entryRuleCollision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollision = null;


        try {
            // InternalDsl.g:832:50: (iv_ruleCollision= ruleCollision EOF )
            // InternalDsl.g:833:2: iv_ruleCollision= ruleCollision EOF
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
    // InternalDsl.g:839:1: ruleCollision returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Geometry' ( (lv_geometry_2_0= ruleGeometry ) ) (otherlv_3= 'Origin' ( (lv_origin_4_0= ruleOrigin ) ) )? ) ;
    public final EObject ruleCollision() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_geometry_2_0 = null;

        EObject lv_origin_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:845:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Geometry' ( (lv_geometry_2_0= ruleGeometry ) ) (otherlv_3= 'Origin' ( (lv_origin_4_0= ruleOrigin ) ) )? ) )
            // InternalDsl.g:846:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Geometry' ( (lv_geometry_2_0= ruleGeometry ) ) (otherlv_3= 'Origin' ( (lv_origin_4_0= ruleOrigin ) ) )? )
            {
            // InternalDsl.g:846:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Geometry' ( (lv_geometry_2_0= ruleGeometry ) ) (otherlv_3= 'Origin' ( (lv_origin_4_0= ruleOrigin ) ) )? )
            // InternalDsl.g:847:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'Geometry' ( (lv_geometry_2_0= ruleGeometry ) ) (otherlv_3= 'Origin' ( (lv_origin_4_0= ruleOrigin ) ) )?
            {
            // InternalDsl.g:847:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:848:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:848:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:849:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollisionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getCollisionAccess().getGeometryKeyword_1());
            		
            // InternalDsl.g:869:3: ( (lv_geometry_2_0= ruleGeometry ) )
            // InternalDsl.g:870:4: (lv_geometry_2_0= ruleGeometry )
            {
            // InternalDsl.g:870:4: (lv_geometry_2_0= ruleGeometry )
            // InternalDsl.g:871:5: lv_geometry_2_0= ruleGeometry
            {

            					newCompositeNode(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_33);
            lv_geometry_2_0=ruleGeometry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollisionRule());
            					}
            					set(
            						current,
            						"geometry",
            						lv_geometry_2_0,
            						"org.xtext.urdf.Dsl.Geometry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:888:3: (otherlv_3= 'Origin' ( (lv_origin_4_0= ruleOrigin ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:889:4: otherlv_3= 'Origin' ( (lv_origin_4_0= ruleOrigin ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getCollisionAccess().getOriginKeyword_3_0());
                    			
                    // InternalDsl.g:893:4: ( (lv_origin_4_0= ruleOrigin ) )
                    // InternalDsl.g:894:5: (lv_origin_4_0= ruleOrigin )
                    {
                    // InternalDsl.g:894:5: (lv_origin_4_0= ruleOrigin )
                    // InternalDsl.g:895:6: lv_origin_4_0= ruleOrigin
                    {

                    						newCompositeNode(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_origin_4_0=ruleOrigin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCollisionRule());
                    						}
                    						set(
                    							current,
                    							"origin",
                    							lv_origin_4_0,
                    							"org.xtext.urdf.Dsl.Origin");
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
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:917:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalDsl.g:917:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalDsl.g:918:2: iv_ruleOrigin= ruleOrigin EOF
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
    // InternalDsl.g:924:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleFLOAT ) ) ( (lv_y_4_0= ruleFLOAT ) ) ( (lv_z_5_0= ruleFLOAT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleFLOAT ) ) ( (lv_pitch_8_0= ruleFLOAT ) ) ( (lv_yaw_9_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_4_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;

        AntlrDatatypeRuleToken lv_roll_7_0 = null;

        AntlrDatatypeRuleToken lv_pitch_8_0 = null;

        AntlrDatatypeRuleToken lv_yaw_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:930:2: ( (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleFLOAT ) ) ( (lv_y_4_0= ruleFLOAT ) ) ( (lv_z_5_0= ruleFLOAT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleFLOAT ) ) ( (lv_pitch_8_0= ruleFLOAT ) ) ( (lv_yaw_9_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:931:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleFLOAT ) ) ( (lv_y_4_0= ruleFLOAT ) ) ( (lv_z_5_0= ruleFLOAT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleFLOAT ) ) ( (lv_pitch_8_0= ruleFLOAT ) ) ( (lv_yaw_9_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:931:2: (otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleFLOAT ) ) ( (lv_y_4_0= ruleFLOAT ) ) ( (lv_z_5_0= ruleFLOAT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleFLOAT ) ) ( (lv_pitch_8_0= ruleFLOAT ) ) ( (lv_yaw_9_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:932:3: otherlv_0= 'Origin' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'xyz' ( (lv_x_3_0= ruleFLOAT ) ) ( (lv_y_4_0= ruleFLOAT ) ) ( (lv_z_5_0= ruleFLOAT ) ) (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleFLOAT ) ) ( (lv_pitch_8_0= ruleFLOAT ) ) ( (lv_yaw_9_0= ruleFLOAT ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            // InternalDsl.g:936:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:937:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:937:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:938:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOriginRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getOriginAccess().getXyzKeyword_2());
            		
            // InternalDsl.g:958:3: ( (lv_x_3_0= ruleFLOAT ) )
            // InternalDsl.g:959:4: (lv_x_3_0= ruleFLOAT )
            {
            // InternalDsl.g:959:4: (lv_x_3_0= ruleFLOAT )
            // InternalDsl.g:960:5: lv_x_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getXFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_x_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:977:3: ( (lv_y_4_0= ruleFLOAT ) )
            // InternalDsl.g:978:4: (lv_y_4_0= ruleFLOAT )
            {
            // InternalDsl.g:978:4: (lv_y_4_0= ruleFLOAT )
            // InternalDsl.g:979:5: lv_y_4_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getYFLOATParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_42);
            lv_y_4_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_4_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:996:3: ( (lv_z_5_0= ruleFLOAT ) )
            // InternalDsl.g:997:4: (lv_z_5_0= ruleFLOAT )
            {
            // InternalDsl.g:997:4: (lv_z_5_0= ruleFLOAT )
            // InternalDsl.g:998:5: lv_z_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getZFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_43);
            lv_z_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_5_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:1015:3: (otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleFLOAT ) ) ( (lv_pitch_8_0= ruleFLOAT ) ) ( (lv_yaw_9_0= ruleFLOAT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:1016:4: otherlv_6= 'roll_pitch_yaw' ( (lv_roll_7_0= ruleFLOAT ) ) ( (lv_pitch_8_0= ruleFLOAT ) ) ( (lv_yaw_9_0= ruleFLOAT ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_42); 

                    				newLeafNode(otherlv_6, grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0());
                    			
                    // InternalDsl.g:1020:4: ( (lv_roll_7_0= ruleFLOAT ) )
                    // InternalDsl.g:1021:5: (lv_roll_7_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1021:5: (lv_roll_7_0= ruleFLOAT )
                    // InternalDsl.g:1022:6: lv_roll_7_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getRollFLOATParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_roll_7_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"roll",
                    							lv_roll_7_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1039:4: ( (lv_pitch_8_0= ruleFLOAT ) )
                    // InternalDsl.g:1040:5: (lv_pitch_8_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1040:5: (lv_pitch_8_0= ruleFLOAT )
                    // InternalDsl.g:1041:6: lv_pitch_8_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getPitchFLOATParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_pitch_8_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"pitch",
                    							lv_pitch_8_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1058:4: ( (lv_yaw_9_0= ruleFLOAT ) )
                    // InternalDsl.g:1059:5: (lv_yaw_9_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1059:5: (lv_yaw_9_0= ruleFLOAT )
                    // InternalDsl.g:1060:6: lv_yaw_9_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOriginAccess().getYawFLOATParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_yaw_9_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOriginRule());
                    						}
                    						set(
                    							current,
                    							"yaw",
                    							lv_yaw_9_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:1082:1: entryRuleMass returns [EObject current=null] : iv_ruleMass= ruleMass EOF ;
    public final EObject entryRuleMass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMass = null;


        try {
            // InternalDsl.g:1082:45: (iv_ruleMass= ruleMass EOF )
            // InternalDsl.g:1083:2: iv_ruleMass= ruleMass EOF
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
    // InternalDsl.g:1089:1: ruleMass returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'massValueInKilograms' ( (lv_massValueInKilograms_2_0= ruleFLOAT ) ) ) ;
    public final EObject ruleMass() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_massValueInKilograms_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1095:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'massValueInKilograms' ( (lv_massValueInKilograms_2_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1096:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'massValueInKilograms' ( (lv_massValueInKilograms_2_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1096:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'massValueInKilograms' ( (lv_massValueInKilograms_2_0= ruleFLOAT ) ) )
            // InternalDsl.g:1097:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'massValueInKilograms' ( (lv_massValueInKilograms_2_0= ruleFLOAT ) )
            {
            // InternalDsl.g:1097:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:1098:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:1098:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:1099:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_44); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getMassAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMassRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,33,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_1());
            		
            // InternalDsl.g:1119:3: ( (lv_massValueInKilograms_2_0= ruleFLOAT ) )
            // InternalDsl.g:1120:4: (lv_massValueInKilograms_2_0= ruleFLOAT )
            {
            // InternalDsl.g:1120:4: (lv_massValueInKilograms_2_0= ruleFLOAT )
            // InternalDsl.g:1121:5: lv_massValueInKilograms_2_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getMassAccess().getMassValueInKilogramsFLOATParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_massValueInKilograms_2_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMassRule());
            					}
            					set(
            						current,
            						"massValueInKilograms",
            						lv_massValueInKilograms_2_0,
            						"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:1142:1: entryRuleInertia returns [EObject current=null] : iv_ruleInertia= ruleInertia EOF ;
    public final EObject entryRuleInertia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInertia = null;


        try {
            // InternalDsl.g:1142:48: (iv_ruleInertia= ruleInertia EOF )
            // InternalDsl.g:1143:2: iv_ruleInertia= ruleInertia EOF
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
    // InternalDsl.g:1149:1: ruleInertia returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'ixx' ( (lv_ixx_2_0= ruleFLOAT ) ) otherlv_3= 'ixy' ( (lv_ixy_4_0= ruleFLOAT ) ) otherlv_5= 'ixz' ( (lv_ixz_6_0= ruleFLOAT ) ) otherlv_7= 'iyy' ( (lv_iyy_8_0= ruleFLOAT ) ) otherlv_9= 'iyz' ( (lv_iyz_10_0= ruleFLOAT ) ) otherlv_11= 'izz' ( (lv_izz_12_0= ruleFLOAT ) ) ) ;
    public final EObject ruleInertia() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_ixx_2_0 = null;

        AntlrDatatypeRuleToken lv_ixy_4_0 = null;

        AntlrDatatypeRuleToken lv_ixz_6_0 = null;

        AntlrDatatypeRuleToken lv_iyy_8_0 = null;

        AntlrDatatypeRuleToken lv_iyz_10_0 = null;

        AntlrDatatypeRuleToken lv_izz_12_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1155:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'ixx' ( (lv_ixx_2_0= ruleFLOAT ) ) otherlv_3= 'ixy' ( (lv_ixy_4_0= ruleFLOAT ) ) otherlv_5= 'ixz' ( (lv_ixz_6_0= ruleFLOAT ) ) otherlv_7= 'iyy' ( (lv_iyy_8_0= ruleFLOAT ) ) otherlv_9= 'iyz' ( (lv_iyz_10_0= ruleFLOAT ) ) otherlv_11= 'izz' ( (lv_izz_12_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1156:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'ixx' ( (lv_ixx_2_0= ruleFLOAT ) ) otherlv_3= 'ixy' ( (lv_ixy_4_0= ruleFLOAT ) ) otherlv_5= 'ixz' ( (lv_ixz_6_0= ruleFLOAT ) ) otherlv_7= 'iyy' ( (lv_iyy_8_0= ruleFLOAT ) ) otherlv_9= 'iyz' ( (lv_iyz_10_0= ruleFLOAT ) ) otherlv_11= 'izz' ( (lv_izz_12_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1156:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'ixx' ( (lv_ixx_2_0= ruleFLOAT ) ) otherlv_3= 'ixy' ( (lv_ixy_4_0= ruleFLOAT ) ) otherlv_5= 'ixz' ( (lv_ixz_6_0= ruleFLOAT ) ) otherlv_7= 'iyy' ( (lv_iyy_8_0= ruleFLOAT ) ) otherlv_9= 'iyz' ( (lv_iyz_10_0= ruleFLOAT ) ) otherlv_11= 'izz' ( (lv_izz_12_0= ruleFLOAT ) ) )
            // InternalDsl.g:1157:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'ixx' ( (lv_ixx_2_0= ruleFLOAT ) ) otherlv_3= 'ixy' ( (lv_ixy_4_0= ruleFLOAT ) ) otherlv_5= 'ixz' ( (lv_ixz_6_0= ruleFLOAT ) ) otherlv_7= 'iyy' ( (lv_iyy_8_0= ruleFLOAT ) ) otherlv_9= 'iyz' ( (lv_iyz_10_0= ruleFLOAT ) ) otherlv_11= 'izz' ( (lv_izz_12_0= ruleFLOAT ) )
            {
            // InternalDsl.g:1157:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:1158:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:1158:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:1159:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_45); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInertiaRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getInertiaAccess().getIxxKeyword_1());
            		
            // InternalDsl.g:1179:3: ( (lv_ixx_2_0= ruleFLOAT ) )
            // InternalDsl.g:1180:4: (lv_ixx_2_0= ruleFLOAT )
            {
            // InternalDsl.g:1180:4: (lv_ixx_2_0= ruleFLOAT )
            // InternalDsl.g:1181:5: lv_ixx_2_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxxFLOATParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_ixx_2_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixx",
            						lv_ixx_2_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getInertiaAccess().getIxyKeyword_3());
            		
            // InternalDsl.g:1202:3: ( (lv_ixy_4_0= ruleFLOAT ) )
            // InternalDsl.g:1203:4: (lv_ixy_4_0= ruleFLOAT )
            {
            // InternalDsl.g:1203:4: (lv_ixy_4_0= ruleFLOAT )
            // InternalDsl.g:1204:5: lv_ixy_4_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxyFLOATParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_47);
            lv_ixy_4_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixy",
            						lv_ixy_4_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getInertiaAccess().getIxzKeyword_5());
            		
            // InternalDsl.g:1225:3: ( (lv_ixz_6_0= ruleFLOAT ) )
            // InternalDsl.g:1226:4: (lv_ixz_6_0= ruleFLOAT )
            {
            // InternalDsl.g:1226:4: (lv_ixz_6_0= ruleFLOAT )
            // InternalDsl.g:1227:5: lv_ixz_6_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIxzFLOATParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_48);
            lv_ixz_6_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"ixz",
            						lv_ixz_6_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_42); 

            			newLeafNode(otherlv_7, grammarAccess.getInertiaAccess().getIyyKeyword_7());
            		
            // InternalDsl.g:1248:3: ( (lv_iyy_8_0= ruleFLOAT ) )
            // InternalDsl.g:1249:4: (lv_iyy_8_0= ruleFLOAT )
            {
            // InternalDsl.g:1249:4: (lv_iyy_8_0= ruleFLOAT )
            // InternalDsl.g:1250:5: lv_iyy_8_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyyFLOATParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_49);
            lv_iyy_8_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyy",
            						lv_iyy_8_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,38,FOLLOW_42); 

            			newLeafNode(otherlv_9, grammarAccess.getInertiaAccess().getIyzKeyword_9());
            		
            // InternalDsl.g:1271:3: ( (lv_iyz_10_0= ruleFLOAT ) )
            // InternalDsl.g:1272:4: (lv_iyz_10_0= ruleFLOAT )
            {
            // InternalDsl.g:1272:4: (lv_iyz_10_0= ruleFLOAT )
            // InternalDsl.g:1273:5: lv_iyz_10_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIyzFLOATParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_50);
            lv_iyz_10_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"iyz",
            						lv_iyz_10_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,39,FOLLOW_42); 

            			newLeafNode(otherlv_11, grammarAccess.getInertiaAccess().getIzzKeyword_11());
            		
            // InternalDsl.g:1294:3: ( (lv_izz_12_0= ruleFLOAT ) )
            // InternalDsl.g:1295:4: (lv_izz_12_0= ruleFLOAT )
            {
            // InternalDsl.g:1295:4: (lv_izz_12_0= ruleFLOAT )
            // InternalDsl.g:1296:5: lv_izz_12_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getInertiaAccess().getIzzFLOATParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_2);
            lv_izz_12_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInertiaRule());
            					}
            					set(
            						current,
            						"izz",
            						lv_izz_12_0,
            						"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:1317:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalDsl.g:1317:46: (iv_ruleColor= ruleColor EOF )
            // InternalDsl.g:1318:2: iv_ruleColor= ruleColor EOF
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
    // InternalDsl.g:1324:1: ruleColor returns [EObject current=null] : ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) ) | (otherlv_7= 'red' ( (lv_red_8_0= ruleFLOAT ) ) otherlv_9= 'green' ( (lv_green_10_0= ruleFLOAT ) ) otherlv_11= 'blue' ( (lv_blue_12_0= ruleFLOAT ) ) otherlv_13= 'alpha' ( (lv_alpha_14_0= ruleFLOAT ) ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_red_3_0 = null;

        AntlrDatatypeRuleToken lv_green_4_0 = null;

        AntlrDatatypeRuleToken lv_blue_5_0 = null;

        AntlrDatatypeRuleToken lv_alpha_6_0 = null;

        AntlrDatatypeRuleToken lv_red_8_0 = null;

        AntlrDatatypeRuleToken lv_green_10_0 = null;

        AntlrDatatypeRuleToken lv_blue_12_0 = null;

        AntlrDatatypeRuleToken lv_alpha_14_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1330:2: ( ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) ) | (otherlv_7= 'red' ( (lv_red_8_0= ruleFLOAT ) ) otherlv_9= 'green' ( (lv_green_10_0= ruleFLOAT ) ) otherlv_11= 'blue' ( (lv_blue_12_0= ruleFLOAT ) ) otherlv_13= 'alpha' ( (lv_alpha_14_0= ruleFLOAT ) ) ) ) )
            // InternalDsl.g:1331:2: ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) ) | (otherlv_7= 'red' ( (lv_red_8_0= ruleFLOAT ) ) otherlv_9= 'green' ( (lv_green_10_0= ruleFLOAT ) ) otherlv_11= 'blue' ( (lv_blue_12_0= ruleFLOAT ) ) otherlv_13= 'alpha' ( (lv_alpha_14_0= ruleFLOAT ) ) ) )
            {
            // InternalDsl.g:1331:2: ( (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) ) | (otherlv_7= 'red' ( (lv_red_8_0= ruleFLOAT ) ) otherlv_9= 'green' ( (lv_green_10_0= ruleFLOAT ) ) otherlv_11= 'blue' ( (lv_blue_12_0= ruleFLOAT ) ) otherlv_13= 'alpha' ( (lv_alpha_14_0= ruleFLOAT ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            else if ( (LA27_0==42) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:1332:3: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) )
                    {
                    // InternalDsl.g:1332:3: (otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) ) )
                    // InternalDsl.g:1333:4: otherlv_0= 'Color' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'red_green_blue_alpha' ( (lv_red_3_0= ruleFLOAT ) ) ( (lv_green_4_0= ruleFLOAT ) ) ( (lv_blue_5_0= ruleFLOAT ) ) ( (lv_alpha_6_0= ruleFLOAT ) )
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_51); 

                    				newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0_0());
                    			
                    // InternalDsl.g:1337:4: ( (lv_name_1_0= RULE_ID ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==RULE_ID) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalDsl.g:1338:5: (lv_name_1_0= RULE_ID )
                            {
                            // InternalDsl.g:1338:5: (lv_name_1_0= RULE_ID )
                            // InternalDsl.g:1339:6: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); 

                            						newLeafNode(lv_name_1_0, grammarAccess.getColorAccess().getNameIDTerminalRuleCall_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getColorRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_1_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getColorAccess().getRed_green_blue_alphaKeyword_0_2());
                    			
                    // InternalDsl.g:1359:4: ( (lv_red_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1360:5: (lv_red_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1360:5: (lv_red_3_0= ruleFLOAT )
                    // InternalDsl.g:1361:6: lv_red_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_red_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"red",
                    							lv_red_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1378:4: ( (lv_green_4_0= ruleFLOAT ) )
                    // InternalDsl.g:1379:5: (lv_green_4_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1379:5: (lv_green_4_0= ruleFLOAT )
                    // InternalDsl.g:1380:6: lv_green_4_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_green_4_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"green",
                    							lv_green_4_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1397:4: ( (lv_blue_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1398:5: (lv_blue_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1398:5: (lv_blue_5_0= ruleFLOAT )
                    // InternalDsl.g:1399:6: lv_blue_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_blue_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"blue",
                    							lv_blue_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1416:4: ( (lv_alpha_6_0= ruleFLOAT ) )
                    // InternalDsl.g:1417:5: (lv_alpha_6_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1417:5: (lv_alpha_6_0= ruleFLOAT )
                    // InternalDsl.g:1418:6: lv_alpha_6_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alpha_6_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"alpha",
                    							lv_alpha_6_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1437:3: (otherlv_7= 'red' ( (lv_red_8_0= ruleFLOAT ) ) otherlv_9= 'green' ( (lv_green_10_0= ruleFLOAT ) ) otherlv_11= 'blue' ( (lv_blue_12_0= ruleFLOAT ) ) otherlv_13= 'alpha' ( (lv_alpha_14_0= ruleFLOAT ) ) )
                    {
                    // InternalDsl.g:1437:3: (otherlv_7= 'red' ( (lv_red_8_0= ruleFLOAT ) ) otherlv_9= 'green' ( (lv_green_10_0= ruleFLOAT ) ) otherlv_11= 'blue' ( (lv_blue_12_0= ruleFLOAT ) ) otherlv_13= 'alpha' ( (lv_alpha_14_0= ruleFLOAT ) ) )
                    // InternalDsl.g:1438:4: otherlv_7= 'red' ( (lv_red_8_0= ruleFLOAT ) ) otherlv_9= 'green' ( (lv_green_10_0= ruleFLOAT ) ) otherlv_11= 'blue' ( (lv_blue_12_0= ruleFLOAT ) ) otherlv_13= 'alpha' ( (lv_alpha_14_0= ruleFLOAT ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_42); 

                    				newLeafNode(otherlv_7, grammarAccess.getColorAccess().getRedKeyword_1_0());
                    			
                    // InternalDsl.g:1442:4: ( (lv_red_8_0= ruleFLOAT ) )
                    // InternalDsl.g:1443:5: (lv_red_8_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1443:5: (lv_red_8_0= ruleFLOAT )
                    // InternalDsl.g:1444:6: lv_red_8_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_red_8_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"red",
                    							lv_red_8_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,43,FOLLOW_42); 

                    				newLeafNode(otherlv_9, grammarAccess.getColorAccess().getGreenKeyword_1_2());
                    			
                    // InternalDsl.g:1465:4: ( (lv_green_10_0= ruleFLOAT ) )
                    // InternalDsl.g:1466:5: (lv_green_10_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1466:5: (lv_green_10_0= ruleFLOAT )
                    // InternalDsl.g:1467:6: lv_green_10_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_green_10_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"green",
                    							lv_green_10_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,44,FOLLOW_42); 

                    				newLeafNode(otherlv_11, grammarAccess.getColorAccess().getBlueKeyword_1_4());
                    			
                    // InternalDsl.g:1488:4: ( (lv_blue_12_0= ruleFLOAT ) )
                    // InternalDsl.g:1489:5: (lv_blue_12_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1489:5: (lv_blue_12_0= ruleFLOAT )
                    // InternalDsl.g:1490:6: lv_blue_12_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_blue_12_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"blue",
                    							lv_blue_12_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,45,FOLLOW_42); 

                    				newLeafNode(otherlv_13, grammarAccess.getColorAccess().getAlphaKeyword_1_6());
                    			
                    // InternalDsl.g:1511:4: ( (lv_alpha_14_0= ruleFLOAT ) )
                    // InternalDsl.g:1512:5: (lv_alpha_14_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1512:5: (lv_alpha_14_0= ruleFLOAT )
                    // InternalDsl.g:1513:6: lv_alpha_14_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_1_7_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_alpha_14_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColorRule());
                    						}
                    						set(
                    							current,
                    							"alpha",
                    							lv_alpha_14_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:1535:1: entryRuleTexture returns [EObject current=null] : iv_ruleTexture= ruleTexture EOF ;
    public final EObject entryRuleTexture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexture = null;


        try {
            // InternalDsl.g:1535:48: (iv_ruleTexture= ruleTexture EOF )
            // InternalDsl.g:1536:2: iv_ruleTexture= ruleTexture EOF
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
    // InternalDsl.g:1542:1: ruleTexture returns [EObject current=null] : (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTexture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pathToFile_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1548:2: ( (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1549:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1549:2: (otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) )
            // InternalDsl.g:1550:3: otherlv_0= 'Texture' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getTextureAccess().getTextureKeyword_0());
            		
            // InternalDsl.g:1554:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:1555:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1555:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1556:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextureRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getTextureAccess().getPathToFileKeyword_2());
            		
            // InternalDsl.g:1576:3: ( (lv_pathToFile_3_0= RULE_STRING ) )
            // InternalDsl.g:1577:4: (lv_pathToFile_3_0= RULE_STRING )
            {
            // InternalDsl.g:1577:4: (lv_pathToFile_3_0= RULE_STRING )
            // InternalDsl.g:1578:5: lv_pathToFile_3_0= RULE_STRING
            {
            lv_pathToFile_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_pathToFile_3_0, grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pathToFile",
            						lv_pathToFile_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:1598:1: entryRuleBox returns [EObject current=null] : iv_ruleBox= ruleBox EOF ;
    public final EObject entryRuleBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBox = null;


        try {
            // InternalDsl.g:1598:44: (iv_ruleBox= ruleBox EOF )
            // InternalDsl.g:1599:2: iv_ruleBox= ruleBox EOF
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
    // InternalDsl.g:1605:1: ruleBox returns [EObject current=null] : ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleFLOAT ) ) ( (lv_length_4_0= ruleFLOAT ) ) ( (lv_width_5_0= ruleFLOAT ) ) ) | (otherlv_6= 'height' ( (lv_height_7_0= ruleFLOAT ) ) otherlv_8= 'length' ( (lv_length_9_0= ruleFLOAT ) ) otherlv_10= 'width' ( (lv_width_11_0= ruleFLOAT ) ) ) ) ;
    public final EObject ruleBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_height_3_0 = null;

        AntlrDatatypeRuleToken lv_length_4_0 = null;

        AntlrDatatypeRuleToken lv_width_5_0 = null;

        AntlrDatatypeRuleToken lv_height_7_0 = null;

        AntlrDatatypeRuleToken lv_length_9_0 = null;

        AntlrDatatypeRuleToken lv_width_11_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1611:2: ( ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleFLOAT ) ) ( (lv_length_4_0= ruleFLOAT ) ) ( (lv_width_5_0= ruleFLOAT ) ) ) | (otherlv_6= 'height' ( (lv_height_7_0= ruleFLOAT ) ) otherlv_8= 'length' ( (lv_length_9_0= ruleFLOAT ) ) otherlv_10= 'width' ( (lv_width_11_0= ruleFLOAT ) ) ) ) )
            // InternalDsl.g:1612:2: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleFLOAT ) ) ( (lv_length_4_0= ruleFLOAT ) ) ( (lv_width_5_0= ruleFLOAT ) ) ) | (otherlv_6= 'height' ( (lv_height_7_0= ruleFLOAT ) ) otherlv_8= 'length' ( (lv_length_9_0= ruleFLOAT ) ) otherlv_10= 'width' ( (lv_width_11_0= ruleFLOAT ) ) ) )
            {
            // InternalDsl.g:1612:2: ( (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleFLOAT ) ) ( (lv_length_4_0= ruleFLOAT ) ) ( (lv_width_5_0= ruleFLOAT ) ) ) | (otherlv_6= 'height' ( (lv_height_7_0= ruleFLOAT ) ) otherlv_8= 'length' ( (lv_length_9_0= ruleFLOAT ) ) otherlv_10= 'width' ( (lv_width_11_0= ruleFLOAT ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            else if ( (LA30_0==50) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:1613:3: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleFLOAT ) ) ( (lv_length_4_0= ruleFLOAT ) ) ( (lv_width_5_0= ruleFLOAT ) ) )
                    {
                    // InternalDsl.g:1613:3: (otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleFLOAT ) ) ( (lv_length_4_0= ruleFLOAT ) ) ( (lv_width_5_0= ruleFLOAT ) ) )
                    // InternalDsl.g:1614:4: otherlv_0= 'Box' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'height_length_width' ( (lv_height_3_0= ruleFLOAT ) ) ( (lv_length_4_0= ruleFLOAT ) ) ( (lv_width_5_0= ruleFLOAT ) )
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_59); 

                    				newLeafNode(otherlv_0, grammarAccess.getBoxAccess().getBoxKeyword_0_0());
                    			
                    // InternalDsl.g:1618:4: ( (lv_name_1_0= RULE_ID ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalDsl.g:1619:5: (lv_name_1_0= RULE_ID )
                            {
                            // InternalDsl.g:1619:5: (lv_name_1_0= RULE_ID )
                            // InternalDsl.g:1620:6: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_60); 

                            						newLeafNode(lv_name_1_0, grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBoxRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_1_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,49,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getBoxAccess().getHeight_length_widthKeyword_0_2());
                    			
                    // InternalDsl.g:1640:4: ( (lv_height_3_0= ruleFLOAT ) )
                    // InternalDsl.g:1641:5: (lv_height_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1641:5: (lv_height_3_0= ruleFLOAT )
                    // InternalDsl.g:1642:6: lv_height_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_height_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1659:4: ( (lv_length_4_0= ruleFLOAT ) )
                    // InternalDsl.g:1660:5: (lv_length_4_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1660:5: (lv_length_4_0= ruleFLOAT )
                    // InternalDsl.g:1661:6: lv_length_4_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_length_4_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_4_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:1678:4: ( (lv_width_5_0= ruleFLOAT ) )
                    // InternalDsl.g:1679:5: (lv_width_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1679:5: (lv_width_5_0= ruleFLOAT )
                    // InternalDsl.g:1680:6: lv_width_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_width_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1699:3: (otherlv_6= 'height' ( (lv_height_7_0= ruleFLOAT ) ) otherlv_8= 'length' ( (lv_length_9_0= ruleFLOAT ) ) otherlv_10= 'width' ( (lv_width_11_0= ruleFLOAT ) ) )
                    {
                    // InternalDsl.g:1699:3: (otherlv_6= 'height' ( (lv_height_7_0= ruleFLOAT ) ) otherlv_8= 'length' ( (lv_length_9_0= ruleFLOAT ) ) otherlv_10= 'width' ( (lv_width_11_0= ruleFLOAT ) ) )
                    // InternalDsl.g:1700:4: otherlv_6= 'height' ( (lv_height_7_0= ruleFLOAT ) ) otherlv_8= 'length' ( (lv_length_9_0= ruleFLOAT ) ) otherlv_10= 'width' ( (lv_width_11_0= ruleFLOAT ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_42); 

                    				newLeafNode(otherlv_6, grammarAccess.getBoxAccess().getHeightKeyword_1_0());
                    			
                    // InternalDsl.g:1704:4: ( (lv_height_7_0= ruleFLOAT ) )
                    // InternalDsl.g:1705:5: (lv_height_7_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1705:5: (lv_height_7_0= ruleFLOAT )
                    // InternalDsl.g:1706:6: lv_height_7_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getHeightFLOATParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_height_7_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_7_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,51,FOLLOW_42); 

                    				newLeafNode(otherlv_8, grammarAccess.getBoxAccess().getLengthKeyword_1_2());
                    			
                    // InternalDsl.g:1727:4: ( (lv_length_9_0= ruleFLOAT ) )
                    // InternalDsl.g:1728:5: (lv_length_9_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1728:5: (lv_length_9_0= ruleFLOAT )
                    // InternalDsl.g:1729:6: lv_length_9_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getLengthFLOATParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_length_9_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"length",
                    							lv_length_9_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,52,FOLLOW_42); 

                    				newLeafNode(otherlv_10, grammarAccess.getBoxAccess().getWidthKeyword_1_4());
                    			
                    // InternalDsl.g:1750:4: ( (lv_width_11_0= ruleFLOAT ) )
                    // InternalDsl.g:1751:5: (lv_width_11_0= ruleFLOAT )
                    {
                    // InternalDsl.g:1751:5: (lv_width_11_0= ruleFLOAT )
                    // InternalDsl.g:1752:6: lv_width_11_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getBoxAccess().getWidthFLOATParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_width_11_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoxRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_11_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:1774:1: entryRuleCylinder returns [EObject current=null] : iv_ruleCylinder= ruleCylinder EOF ;
    public final EObject entryRuleCylinder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCylinder = null;


        try {
            // InternalDsl.g:1774:49: (iv_ruleCylinder= ruleCylinder EOF )
            // InternalDsl.g:1775:2: iv_ruleCylinder= ruleCylinder EOF
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
    // InternalDsl.g:1781:1: ruleCylinder returns [EObject current=null] : (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) ) ;
    public final EObject ruleCylinder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;

        AntlrDatatypeRuleToken lv_length_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1787:2: ( (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1788:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1788:2: (otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) ) )
            // InternalDsl.g:1789:3: otherlv_0= 'Cylinder' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) otherlv_4= 'length' ( (lv_length_5_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getCylinderAccess().getCylinderKeyword_0());
            		
            // InternalDsl.g:1793:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:1794:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1794:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1795:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_64); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCylinderRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,54,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getCylinderAccess().getRadiusKeyword_2());
            		
            // InternalDsl.g:1815:3: ( (lv_radius_3_0= ruleFLOAT ) )
            // InternalDsl.g:1816:4: (lv_radius_3_0= ruleFLOAT )
            {
            // InternalDsl.g:1816:4: (lv_radius_3_0= ruleFLOAT )
            // InternalDsl.g:1817:5: lv_radius_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getRadiusFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_61);
            lv_radius_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,51,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getCylinderAccess().getLengthKeyword_4());
            		
            // InternalDsl.g:1838:3: ( (lv_length_5_0= ruleFLOAT ) )
            // InternalDsl.g:1839:4: (lv_length_5_0= ruleFLOAT )
            {
            // InternalDsl.g:1839:4: (lv_length_5_0= ruleFLOAT )
            // InternalDsl.g:1840:5: lv_length_5_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getCylinderAccess().getLengthFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_length_5_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCylinderRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_5_0,
            						"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:1861:1: entryRuleMesh returns [EObject current=null] : iv_ruleMesh= ruleMesh EOF ;
    public final EObject entryRuleMesh() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMesh = null;


        try {
            // InternalDsl.g:1861:45: (iv_ruleMesh= ruleMesh EOF )
            // InternalDsl.g:1862:2: iv_ruleMesh= ruleMesh EOF
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
    // InternalDsl.g:1868:1: ruleMesh returns [EObject current=null] : (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )? ) ;
    public final EObject ruleMesh() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_pathToFile_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalDsl.g:1874:2: ( (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )? ) )
            // InternalDsl.g:1875:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )? )
            {
            // InternalDsl.g:1875:2: (otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )? )
            // InternalDsl.g:1876:3: otherlv_0= 'Mesh' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'pathToFile' ( (lv_pathToFile_3_0= RULE_STRING ) ) (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getMeshAccess().getMeshKeyword_0());
            		
            // InternalDsl.g:1880:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:1881:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1881:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1882:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMeshRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,47,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getMeshAccess().getPathToFileKeyword_2());
            		
            // InternalDsl.g:1902:3: ( (lv_pathToFile_3_0= RULE_STRING ) )
            // InternalDsl.g:1903:4: (lv_pathToFile_3_0= RULE_STRING )
            {
            // InternalDsl.g:1903:4: (lv_pathToFile_3_0= RULE_STRING )
            // InternalDsl.g:1904:5: lv_pathToFile_3_0= RULE_STRING
            {
            lv_pathToFile_3_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

            					newLeafNode(lv_pathToFile_3_0, grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeshRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pathToFile",
            						lv_pathToFile_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDsl.g:1920:3: (otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:1921:4: otherlv_4= 'scale' ( (otherlv_5= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_58); 

                    				newLeafNode(otherlv_4, grammarAccess.getMeshAccess().getScaleKeyword_4_0());
                    			
                    // InternalDsl.g:1925:4: ( (otherlv_5= RULE_STRING ) )
                    // InternalDsl.g:1926:5: (otherlv_5= RULE_STRING )
                    {
                    // InternalDsl.g:1926:5: (otherlv_5= RULE_STRING )
                    // InternalDsl.g:1927:6: otherlv_5= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMeshRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getMeshAccess().getBoxBoxCrossReference_4_1_0());
                    					

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
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalDsl.g:1943:1: entryRuleSphere returns [EObject current=null] : iv_ruleSphere= ruleSphere EOF ;
    public final EObject entryRuleSphere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSphere = null;


        try {
            // InternalDsl.g:1943:47: (iv_ruleSphere= ruleSphere EOF )
            // InternalDsl.g:1944:2: iv_ruleSphere= ruleSphere EOF
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
    // InternalDsl.g:1950:1: ruleSphere returns [EObject current=null] : (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) ) ;
    public final EObject ruleSphere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_radius_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1956:2: ( (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:1957:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:1957:2: (otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) ) )
            // InternalDsl.g:1958:3: otherlv_0= 'Sphere' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= 'radius' ( (lv_radius_3_0= ruleFLOAT ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_63); 

            			newLeafNode(otherlv_0, grammarAccess.getSphereAccess().getSphereKeyword_0());
            		
            // InternalDsl.g:1962:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:1963:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:1963:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:1964:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_64); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSphereRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,54,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getSphereAccess().getRadiusKeyword_2());
            		
            // InternalDsl.g:1984:3: ( (lv_radius_3_0= ruleFLOAT ) )
            // InternalDsl.g:1985:4: (lv_radius_3_0= ruleFLOAT )
            {
            // InternalDsl.g:1985:4: (lv_radius_3_0= ruleFLOAT )
            // InternalDsl.g:1986:5: lv_radius_3_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getSphereAccess().getRadiusFLOATParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_radius_3_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSphereRule());
            					}
            					set(
            						current,
            						"radius",
            						lv_radius_3_0,
            						"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:2007:1: entryRuleLimit returns [EObject current=null] : iv_ruleLimit= ruleLimit EOF ;
    public final EObject entryRuleLimit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimit = null;


        try {
            // InternalDsl.g:2007:46: (iv_ruleLimit= ruleLimit EOF )
            // InternalDsl.g:2008:2: iv_ruleLimit= ruleLimit EOF
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
    // InternalDsl.g:2014:1: ruleLimit returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'lower' ( (lv_lower_2_0= ruleFLOAT ) ) )? (otherlv_3= 'upper' ( (lv_upper_4_0= ruleFLOAT ) ) )? otherlv_5= 'effort' ( (lv_effort_6_0= ruleFLOAT ) ) otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleFLOAT ) ) ) ;
    public final EObject ruleLimit() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_lower_2_0 = null;

        AntlrDatatypeRuleToken lv_upper_4_0 = null;

        AntlrDatatypeRuleToken lv_effort_6_0 = null;

        AntlrDatatypeRuleToken lv_velocity_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2020:2: ( ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'lower' ( (lv_lower_2_0= ruleFLOAT ) ) )? (otherlv_3= 'upper' ( (lv_upper_4_0= ruleFLOAT ) ) )? otherlv_5= 'effort' ( (lv_effort_6_0= ruleFLOAT ) ) otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:2021:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'lower' ( (lv_lower_2_0= ruleFLOAT ) ) )? (otherlv_3= 'upper' ( (lv_upper_4_0= ruleFLOAT ) ) )? otherlv_5= 'effort' ( (lv_effort_6_0= ruleFLOAT ) ) otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:2021:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'lower' ( (lv_lower_2_0= ruleFLOAT ) ) )? (otherlv_3= 'upper' ( (lv_upper_4_0= ruleFLOAT ) ) )? otherlv_5= 'effort' ( (lv_effort_6_0= ruleFLOAT ) ) otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleFLOAT ) ) )
            // InternalDsl.g:2022:3: ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'lower' ( (lv_lower_2_0= ruleFLOAT ) ) )? (otherlv_3= 'upper' ( (lv_upper_4_0= ruleFLOAT ) ) )? otherlv_5= 'effort' ( (lv_effort_6_0= ruleFLOAT ) ) otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleFLOAT ) )
            {
            // InternalDsl.g:2022:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:2023:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:2023:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:2024:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_66); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLimitRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2040:3: (otherlv_1= 'lower' ( (lv_lower_2_0= ruleFLOAT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:2041:4: otherlv_1= 'lower' ( (lv_lower_2_0= ruleFLOAT ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getLimitAccess().getLowerKeyword_1_0());
                    			
                    // InternalDsl.g:2045:4: ( (lv_lower_2_0= ruleFLOAT ) )
                    // InternalDsl.g:2046:5: (lv_lower_2_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2046:5: (lv_lower_2_0= ruleFLOAT )
                    // InternalDsl.g:2047:6: lv_lower_2_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getLowerFLOATParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_lower_2_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"lower",
                    							lv_lower_2_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2065:3: (otherlv_3= 'upper' ( (lv_upper_4_0= ruleFLOAT ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:2066:4: otherlv_3= 'upper' ( (lv_upper_4_0= ruleFLOAT ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getLimitAccess().getUpperKeyword_2_0());
                    			
                    // InternalDsl.g:2070:4: ( (lv_upper_4_0= ruleFLOAT ) )
                    // InternalDsl.g:2071:5: (lv_upper_4_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2071:5: (lv_upper_4_0= ruleFLOAT )
                    // InternalDsl.g:2072:6: lv_upper_4_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getLimitAccess().getUpperFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_upper_4_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLimitRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_4_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,60,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getLimitAccess().getEffortKeyword_3());
            		
            // InternalDsl.g:2094:3: ( (lv_effort_6_0= ruleFLOAT ) )
            // InternalDsl.g:2095:4: (lv_effort_6_0= ruleFLOAT )
            {
            // InternalDsl.g:2095:4: (lv_effort_6_0= ruleFLOAT )
            // InternalDsl.g:2096:5: lv_effort_6_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getEffortFLOATParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_69);
            lv_effort_6_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"effort",
            						lv_effort_6_0,
            						"org.xtext.urdf.Dsl.FLOAT");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,61,FOLLOW_42); 

            			newLeafNode(otherlv_7, grammarAccess.getLimitAccess().getVelocityKeyword_5());
            		
            // InternalDsl.g:2117:3: ( (lv_velocity_8_0= ruleFLOAT ) )
            // InternalDsl.g:2118:4: (lv_velocity_8_0= ruleFLOAT )
            {
            // InternalDsl.g:2118:4: (lv_velocity_8_0= ruleFLOAT )
            // InternalDsl.g:2119:5: lv_velocity_8_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getLimitAccess().getVelocityFLOATParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_velocity_8_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLimitRule());
            					}
            					set(
            						current,
            						"velocity",
            						lv_velocity_8_0,
            						"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:2140:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // InternalDsl.g:2140:45: (iv_ruleAxis= ruleAxis EOF )
            // InternalDsl.g:2141:2: iv_ruleAxis= ruleAxis EOF
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
    // InternalDsl.g:2147:1: ruleAxis returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_INT ) ) ( (lv_y_3_0= RULE_INT ) ) ( (lv_z_4_0= RULE_INT ) ) ) | (otherlv_5= 'x' ( (lv_x_6_0= RULE_INT ) ) otherlv_7= 'y' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= 'z' ( (lv_z_10_0= RULE_INT ) ) ) ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_x_2_0=null;
        Token lv_y_3_0=null;
        Token lv_z_4_0=null;
        Token otherlv_5=null;
        Token lv_x_6_0=null;
        Token otherlv_7=null;
        Token lv_y_8_0=null;
        Token otherlv_9=null;
        Token lv_z_10_0=null;


        	enterRule();

        try {
            // InternalDsl.g:2153:2: ( ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_INT ) ) ( (lv_y_3_0= RULE_INT ) ) ( (lv_z_4_0= RULE_INT ) ) ) | (otherlv_5= 'x' ( (lv_x_6_0= RULE_INT ) ) otherlv_7= 'y' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= 'z' ( (lv_z_10_0= RULE_INT ) ) ) ) )
            // InternalDsl.g:2154:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_INT ) ) ( (lv_y_3_0= RULE_INT ) ) ( (lv_z_4_0= RULE_INT ) ) ) | (otherlv_5= 'x' ( (lv_x_6_0= RULE_INT ) ) otherlv_7= 'y' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= 'z' ( (lv_z_10_0= RULE_INT ) ) ) )
            {
            // InternalDsl.g:2154:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_INT ) ) ( (lv_y_3_0= RULE_INT ) ) ( (lv_z_4_0= RULE_INT ) ) ) | (otherlv_5= 'x' ( (lv_x_6_0= RULE_INT ) ) otherlv_7= 'y' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= 'z' ( (lv_z_10_0= RULE_INT ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==31) ) {
                alt39=1;
            }
            else if ( (LA39_0==62) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:2155:3: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_INT ) ) ( (lv_y_3_0= RULE_INT ) ) ( (lv_z_4_0= RULE_INT ) ) )
                    {
                    // InternalDsl.g:2155:3: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_INT ) ) ( (lv_y_3_0= RULE_INT ) ) ( (lv_z_4_0= RULE_INT ) ) )
                    // InternalDsl.g:2156:4: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'xyz' ( (lv_x_2_0= RULE_INT ) ) ( (lv_y_3_0= RULE_INT ) ) ( (lv_z_4_0= RULE_INT ) )
                    {
                    // InternalDsl.g:2156:4: ( (lv_name_0_0= RULE_ID ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalDsl.g:2157:5: (lv_name_0_0= RULE_ID )
                            {
                            // InternalDsl.g:2157:5: (lv_name_0_0= RULE_ID )
                            // InternalDsl.g:2158:6: lv_name_0_0= RULE_ID
                            {
                            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                            						newLeafNode(lv_name_0_0, grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_0_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAxisRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_0_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getAxisAccess().getXyzKeyword_0_1());
                    			
                    // InternalDsl.g:2178:4: ( (lv_x_2_0= RULE_INT ) )
                    // InternalDsl.g:2179:5: (lv_x_2_0= RULE_INT )
                    {
                    // InternalDsl.g:2179:5: (lv_x_2_0= RULE_INT )
                    // InternalDsl.g:2180:6: lv_x_2_0= RULE_INT
                    {
                    lv_x_2_0=(Token)match(input,RULE_INT,FOLLOW_42); 

                    						newLeafNode(lv_x_2_0, grammarAccess.getAxisAccess().getXINTTerminalRuleCall_0_2_0());
                    					

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

                    // InternalDsl.g:2196:4: ( (lv_y_3_0= RULE_INT ) )
                    // InternalDsl.g:2197:5: (lv_y_3_0= RULE_INT )
                    {
                    // InternalDsl.g:2197:5: (lv_y_3_0= RULE_INT )
                    // InternalDsl.g:2198:6: lv_y_3_0= RULE_INT
                    {
                    lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_42); 

                    						newLeafNode(lv_y_3_0, grammarAccess.getAxisAccess().getYINTTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"y",
                    							lv_y_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalDsl.g:2214:4: ( (lv_z_4_0= RULE_INT ) )
                    // InternalDsl.g:2215:5: (lv_z_4_0= RULE_INT )
                    {
                    // InternalDsl.g:2215:5: (lv_z_4_0= RULE_INT )
                    // InternalDsl.g:2216:6: lv_z_4_0= RULE_INT
                    {
                    lv_z_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_z_4_0, grammarAccess.getAxisAccess().getZINTTerminalRuleCall_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"z",
                    							lv_z_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2234:3: (otherlv_5= 'x' ( (lv_x_6_0= RULE_INT ) ) otherlv_7= 'y' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= 'z' ( (lv_z_10_0= RULE_INT ) ) )
                    {
                    // InternalDsl.g:2234:3: (otherlv_5= 'x' ( (lv_x_6_0= RULE_INT ) ) otherlv_7= 'y' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= 'z' ( (lv_z_10_0= RULE_INT ) ) )
                    // InternalDsl.g:2235:4: otherlv_5= 'x' ( (lv_x_6_0= RULE_INT ) ) otherlv_7= 'y' ( (lv_y_8_0= RULE_INT ) ) otherlv_9= 'z' ( (lv_z_10_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,62,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getAxisAccess().getXKeyword_1_0());
                    			
                    // InternalDsl.g:2239:4: ( (lv_x_6_0= RULE_INT ) )
                    // InternalDsl.g:2240:5: (lv_x_6_0= RULE_INT )
                    {
                    // InternalDsl.g:2240:5: (lv_x_6_0= RULE_INT )
                    // InternalDsl.g:2241:6: lv_x_6_0= RULE_INT
                    {
                    lv_x_6_0=(Token)match(input,RULE_INT,FOLLOW_70); 

                    						newLeafNode(lv_x_6_0, grammarAccess.getAxisAccess().getXINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"x",
                    							lv_x_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,63,FOLLOW_42); 

                    				newLeafNode(otherlv_7, grammarAccess.getAxisAccess().getYKeyword_1_2());
                    			
                    // InternalDsl.g:2261:4: ( (lv_y_8_0= RULE_INT ) )
                    // InternalDsl.g:2262:5: (lv_y_8_0= RULE_INT )
                    {
                    // InternalDsl.g:2262:5: (lv_y_8_0= RULE_INT )
                    // InternalDsl.g:2263:6: lv_y_8_0= RULE_INT
                    {
                    lv_y_8_0=(Token)match(input,RULE_INT,FOLLOW_71); 

                    						newLeafNode(lv_y_8_0, grammarAccess.getAxisAccess().getYINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"y",
                    							lv_y_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,64,FOLLOW_42); 

                    				newLeafNode(otherlv_9, grammarAccess.getAxisAccess().getZKeyword_1_4());
                    			
                    // InternalDsl.g:2283:4: ( (lv_z_10_0= RULE_INT ) )
                    // InternalDsl.g:2284:5: (lv_z_10_0= RULE_INT )
                    {
                    // InternalDsl.g:2284:5: (lv_z_10_0= RULE_INT )
                    // InternalDsl.g:2285:6: lv_z_10_0= RULE_INT
                    {
                    lv_z_10_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_z_10_0, grammarAccess.getAxisAccess().getZINTTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAxisRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"z",
                    							lv_z_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalDsl.g:2306:1: entryRuleCalibration returns [EObject current=null] : iv_ruleCalibration= ruleCalibration EOF ;
    public final EObject entryRuleCalibration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalibration = null;


        try {
            // InternalDsl.g:2306:52: (iv_ruleCalibration= ruleCalibration EOF )
            // InternalDsl.g:2307:2: iv_ruleCalibration= ruleCalibration EOF
            {
             newCompositeNode(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalibration=ruleCalibration();

            state._fsp--;

             current =iv_ruleCalibration; 
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
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalDsl.g:2313:1: ruleCalibration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleCalibration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_rising_3_0 = null;

        AntlrDatatypeRuleToken lv_falling_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2319:2: ( ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:2320:2: ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:2320:2: ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:2321:3: () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )? (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:2321:3: ()
            // InternalDsl.g:2322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCalibrationAccess().getCalibrationAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2328:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:2329:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:2329:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:2330:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_72); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCalibrationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2346:3: (otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==65) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:2347:4: otherlv_2= 'rising' ( (lv_rising_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getCalibrationAccess().getRisingKeyword_2_0());
                    			
                    // InternalDsl.g:2351:4: ( (lv_rising_3_0= ruleFLOAT ) )
                    // InternalDsl.g:2352:5: (lv_rising_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2352:5: (lv_rising_3_0= ruleFLOAT )
                    // InternalDsl.g:2353:6: lv_rising_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getRisingFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_rising_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"rising",
                    							lv_rising_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2371:3: (otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==66) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:2372:4: otherlv_4= 'falling' ( (lv_falling_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,66,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getCalibrationAccess().getFallingKeyword_3_0());
                    			
                    // InternalDsl.g:2376:4: ( (lv_falling_5_0= ruleFLOAT ) )
                    // InternalDsl.g:2377:5: (lv_falling_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2377:5: (lv_falling_5_0= ruleFLOAT )
                    // InternalDsl.g:2378:6: lv_falling_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getCalibrationAccess().getFallingFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_falling_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalibrationRule());
                    						}
                    						set(
                    							current,
                    							"falling",
                    							lv_falling_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:2400:1: entryRuleDynamics returns [EObject current=null] : iv_ruleDynamics= ruleDynamics EOF ;
    public final EObject entryRuleDynamics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamics = null;


        try {
            // InternalDsl.g:2400:49: (iv_ruleDynamics= ruleDynamics EOF )
            // InternalDsl.g:2401:2: iv_ruleDynamics= ruleDynamics EOF
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
    // InternalDsl.g:2407:1: ruleDynamics returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleDynamics() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_friction_3_0 = null;

        AntlrDatatypeRuleToken lv_damping_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2413:2: ( ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:2414:2: ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:2414:2: ( () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:2415:3: () ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )? (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:2415:3: ()
            // InternalDsl.g:2416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDynamicsAccess().getDynamicsAction_0(),
            					current);
            			

            }

            // InternalDsl.g:2422:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:2423:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDsl.g:2423:4: (lv_name_1_0= RULE_ID )
                    // InternalDsl.g:2424:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_74); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDynamicsRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2440:3: (otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==67) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:2441:4: otherlv_2= 'friction' ( (lv_friction_3_0= ruleFLOAT ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0());
                    			
                    // InternalDsl.g:2445:4: ( (lv_friction_3_0= ruleFLOAT ) )
                    // InternalDsl.g:2446:5: (lv_friction_3_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2446:5: (lv_friction_3_0= ruleFLOAT )
                    // InternalDsl.g:2447:6: lv_friction_3_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getFrictionFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_friction_3_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"friction",
                    							lv_friction_3_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2465:3: (otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==68) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:2466:4: otherlv_4= 'damping' ( (lv_damping_5_0= ruleFLOAT ) )
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getDynamicsAccess().getDampingKeyword_3_0());
                    			
                    // InternalDsl.g:2470:4: ( (lv_damping_5_0= ruleFLOAT ) )
                    // InternalDsl.g:2471:5: (lv_damping_5_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2471:5: (lv_damping_5_0= ruleFLOAT )
                    // InternalDsl.g:2472:6: lv_damping_5_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getDynamicsAccess().getDampingFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_damping_5_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDynamicsRule());
                    						}
                    						set(
                    							current,
                    							"damping",
                    							lv_damping_5_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleMimic"
    // InternalDsl.g:2494:1: entryRuleMimic returns [EObject current=null] : iv_ruleMimic= ruleMimic EOF ;
    public final EObject entryRuleMimic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMimic = null;


        try {
            // InternalDsl.g:2494:46: (iv_ruleMimic= ruleMimic EOF )
            // InternalDsl.g:2495:2: iv_ruleMimic= ruleMimic EOF
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
    // InternalDsl.g:2501:1: ruleMimic returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleFLOAT ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleFLOAT ) ) )? ) ;
    public final EObject ruleMimic() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_multiplier_4_0 = null;

        AntlrDatatypeRuleToken lv_offSet_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2507:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleFLOAT ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleFLOAT ) ) )? ) )
            // InternalDsl.g:2508:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleFLOAT ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleFLOAT ) ) )? )
            {
            // InternalDsl.g:2508:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleFLOAT ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleFLOAT ) ) )? )
            // InternalDsl.g:2509:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= 'mimics' ( (otherlv_2= RULE_STRING ) ) (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleFLOAT ) ) )? (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleFLOAT ) ) )?
            {
            // InternalDsl.g:2509:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:2510:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:2510:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:2511:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_76); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getMimicAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMimicRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,69,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getMimicAccess().getMimicsKeyword_1());
            		
            // InternalDsl.g:2531:3: ( (otherlv_2= RULE_STRING ) )
            // InternalDsl.g:2532:4: (otherlv_2= RULE_STRING )
            {
            // InternalDsl.g:2532:4: (otherlv_2= RULE_STRING )
            // InternalDsl.g:2533:5: otherlv_2= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMimicRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_77); 

            					newLeafNode(otherlv_2, grammarAccess.getMimicAccess().getMimicsJointCrossReference_2_0());
            				

            }


            }

            // InternalDsl.g:2544:3: (otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleFLOAT ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:2545:4: otherlv_3= 'multiplier' ( (lv_multiplier_4_0= ruleFLOAT ) )
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getMimicAccess().getMultiplierKeyword_3_0());
                    			
                    // InternalDsl.g:2549:4: ( (lv_multiplier_4_0= ruleFLOAT ) )
                    // InternalDsl.g:2550:5: (lv_multiplier_4_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2550:5: (lv_multiplier_4_0= ruleFLOAT )
                    // InternalDsl.g:2551:6: lv_multiplier_4_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getMultiplierFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_multiplier_4_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"multiplier",
                    							lv_multiplier_4_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2569:3: (otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleFLOAT ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==71) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:2570:4: otherlv_5= 'offSet' ( (lv_offSet_6_0= ruleFLOAT ) )
                    {
                    otherlv_5=(Token)match(input,71,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getMimicAccess().getOffSetKeyword_4_0());
                    			
                    // InternalDsl.g:2574:4: ( (lv_offSet_6_0= ruleFLOAT ) )
                    // InternalDsl.g:2575:5: (lv_offSet_6_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2575:5: (lv_offSet_6_0= ruleFLOAT )
                    // InternalDsl.g:2576:6: lv_offSet_6_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getMimicAccess().getOffSetFLOATParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_offSet_6_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMimicRule());
                    						}
                    						set(
                    							current,
                    							"offSet",
                    							lv_offSet_6_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:2598:1: entryRuleSafetyController returns [EObject current=null] : iv_ruleSafetyController= ruleSafetyController EOF ;
    public final EObject entryRuleSafetyController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSafetyController = null;


        try {
            // InternalDsl.g:2598:57: (iv_ruleSafetyController= ruleSafetyController EOF )
            // InternalDsl.g:2599:2: iv_ruleSafetyController= ruleSafetyController EOF
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
    // InternalDsl.g:2605:1: ruleSafetyController returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleFLOAT ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleFLOAT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleFLOAT ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleFLOAT ) ) ) ;
    public final EObject ruleSafetyController() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_softLowerLimit_2_0 = null;

        AntlrDatatypeRuleToken lv_softUpperLimit_4_0 = null;

        AntlrDatatypeRuleToken lv_k_position_6_0 = null;

        AntlrDatatypeRuleToken lv_k_velocity_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:2611:2: ( ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleFLOAT ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleFLOAT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleFLOAT ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleFLOAT ) ) ) )
            // InternalDsl.g:2612:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleFLOAT ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleFLOAT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleFLOAT ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleFLOAT ) ) )
            {
            // InternalDsl.g:2612:2: ( ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleFLOAT ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleFLOAT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleFLOAT ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleFLOAT ) ) )
            // InternalDsl.g:2613:3: ( (lv_name_0_0= RULE_ID ) )? (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleFLOAT ) ) )? (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleFLOAT ) ) )? (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleFLOAT ) ) )? otherlv_7= 'k_velocity' ( (lv_k_velocity_8_0= ruleFLOAT ) )
            {
            // InternalDsl.g:2613:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:2614:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalDsl.g:2614:4: (lv_name_0_0= RULE_ID )
                    // InternalDsl.g:2615:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_79); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSafetyControllerRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:2631:3: (otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleFLOAT ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==72) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:2632:4: otherlv_1= 'softLowerLimit' ( (lv_softLowerLimit_2_0= ruleFLOAT ) )
                    {
                    otherlv_1=(Token)match(input,72,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0());
                    			
                    // InternalDsl.g:2636:4: ( (lv_softLowerLimit_2_0= ruleFLOAT ) )
                    // InternalDsl.g:2637:5: (lv_softLowerLimit_2_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2637:5: (lv_softLowerLimit_2_0= ruleFLOAT )
                    // InternalDsl.g:2638:6: lv_softLowerLimit_2_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitFLOATParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_80);
                    lv_softLowerLimit_2_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softLowerLimit",
                    							lv_softLowerLimit_2_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2656:3: (otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleFLOAT ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==73) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:2657:4: otherlv_3= 'softUpperLimit' ( (lv_softUpperLimit_4_0= ruleFLOAT ) )
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_42); 

                    				newLeafNode(otherlv_3, grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0());
                    			
                    // InternalDsl.g:2661:4: ( (lv_softUpperLimit_4_0= ruleFLOAT ) )
                    // InternalDsl.g:2662:5: (lv_softUpperLimit_4_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2662:5: (lv_softUpperLimit_4_0= ruleFLOAT )
                    // InternalDsl.g:2663:6: lv_softUpperLimit_4_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitFLOATParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_81);
                    lv_softUpperLimit_4_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"softUpperLimit",
                    							lv_softUpperLimit_4_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:2681:3: (otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleFLOAT ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==74) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDsl.g:2682:4: otherlv_5= 'k_position' ( (lv_k_position_6_0= ruleFLOAT ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0());
                    			
                    // InternalDsl.g:2686:4: ( (lv_k_position_6_0= ruleFLOAT ) )
                    // InternalDsl.g:2687:5: (lv_k_position_6_0= ruleFLOAT )
                    {
                    // InternalDsl.g:2687:5: (lv_k_position_6_0= ruleFLOAT )
                    // InternalDsl.g:2688:6: lv_k_position_6_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_positionFLOATParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_82);
                    lv_k_position_6_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
                    						}
                    						set(
                    							current,
                    							"k_position",
                    							lv_k_position_6_0,
                    							"org.xtext.urdf.Dsl.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,75,FOLLOW_42); 

            			newLeafNode(otherlv_7, grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4());
            		
            // InternalDsl.g:2710:3: ( (lv_k_velocity_8_0= ruleFLOAT ) )
            // InternalDsl.g:2711:4: (lv_k_velocity_8_0= ruleFLOAT )
            {
            // InternalDsl.g:2711:4: (lv_k_velocity_8_0= ruleFLOAT )
            // InternalDsl.g:2712:5: lv_k_velocity_8_0= ruleFLOAT
            {

            					newCompositeNode(grammarAccess.getSafetyControllerAccess().getK_velocityFLOATParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_k_velocity_8_0=ruleFLOAT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSafetyControllerRule());
            					}
            					set(
            						current,
            						"k_velocity",
            						lv_k_velocity_8_0,
            						"org.xtext.urdf.Dsl.FLOAT");
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
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:2733:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalDsl.g:2733:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalDsl.g:2734:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
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
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalDsl.g:2740:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDsl.g:2746:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDsl.g:2747:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDsl.g:2747:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDsl.g:2748:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_83); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,76,FOLLOW_42); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:2771:1: ruleJointType returns [Enumerator current=null] : ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) ;
    public final Enumerator ruleJointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:2777:2: ( ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) ) )
            // InternalDsl.g:2778:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            {
            // InternalDsl.g:2778:2: ( (enumLiteral_0= 'Revolute' ) | (enumLiteral_1= 'Continous' ) | (enumLiteral_2= 'Fixed' ) | (enumLiteral_3= 'Prismatic' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt53=1;
                }
                break;
            case 78:
                {
                alt53=2;
                }
                break;
            case 79:
                {
                alt53=3;
                }
                break;
            case 80:
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalDsl.g:2779:3: (enumLiteral_0= 'Revolute' )
                    {
                    // InternalDsl.g:2779:3: (enumLiteral_0= 'Revolute' )
                    // InternalDsl.g:2780:4: enumLiteral_0= 'Revolute'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:2787:3: (enumLiteral_1= 'Continous' )
                    {
                    // InternalDsl.g:2787:3: (enumLiteral_1= 'Continous' )
                    // InternalDsl.g:2788:4: enumLiteral_1= 'Continous'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJointTypeAccess().getContinousEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:2795:3: (enumLiteral_2= 'Fixed' )
                    {
                    // InternalDsl.g:2795:3: (enumLiteral_2= 'Fixed' )
                    // InternalDsl.g:2796:4: enumLiteral_2= 'Fixed'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:2803:3: (enumLiteral_3= 'Prismatic' )
                    {
                    // InternalDsl.g:2803:3: (enumLiteral_3= 'Prismatic' )
                    // InternalDsl.g:2804:4: enumLiteral_3= 'Prismatic'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000012002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001FC0002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x1C00000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001F80002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x4000000080000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001F00002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001C00010L,0x0000000000000006L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800010L,0x0000000000000018L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000F00L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x02A5000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040100002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000450000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});

}