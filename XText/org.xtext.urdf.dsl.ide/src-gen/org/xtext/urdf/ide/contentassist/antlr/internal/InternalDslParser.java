package org.xtext.urdf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.urdf.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_AXIS_VALUE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'Fixed'", "'Revolute'", "'Prismatic'", "'Continuous'", "'Robot'", "'Link'", "'Joint'", "'Type'", "'ChildOf'", "'ParentOf'", "'Limit'", "'Axis'", "'Calibration'", "'Dynamics'", "'Mimic'", "'SafetyController'", "'Inertial'", "'Visual'", "'Geometry'", "'Material'", "'Collision'", "'Origin'", "'xyz'", "'roll_pitch_yaw'", "'Mass'", "'massValueInKilograms'", "'Inertia'", "'ixx'", "'ixy'", "'ixz'", "'iyy'", "'iyz'", "'izz'", "'Color'", "'red_green_blue_alpha'", "'Texture'", "'pathToFile'", "'Box'", "'height_length_width'", "'Cylinder'", "'radius'", "'length'", "'Mesh'", "'scale'", "'Sphere'", "'effort'", "'velocity'", "'lower'", "'upper'", "'rising'", "'falling'", "'friction'", "'damping'", "'mimics'", "'multiplier'", "'offSet'", "'k_velocity'", "'softLowerLimit'", "'softUpperLimit'", "'k_position'", "'.'", "'e'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_AXIS_VALUE=7;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobot"
    // InternalDsl.g:53:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleRobot EOF )
            // InternalDsl.g:55:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalDsl.g:62:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Robot__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Robot__Group__0 )
            // InternalDsl.g:69:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMaterial"
    // InternalDsl.g:78:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleMaterial EOF )
            // InternalDsl.g:80:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalDsl.g:87:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Material__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Material__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Material__Alternatives )
            // InternalDsl.g:94:4: rule__Material__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Material__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleGeometry"
    // InternalDsl.g:103:1: entryRuleGeometry : ruleGeometry EOF ;
    public final void entryRuleGeometry() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleGeometry EOF )
            // InternalDsl.g:105:1: ruleGeometry EOF
            {
             before(grammarAccess.getGeometryRule()); 
            pushFollow(FOLLOW_1);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getGeometryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeometry"


    // $ANTLR start "ruleGeometry"
    // InternalDsl.g:112:1: ruleGeometry : ( ( rule__Geometry__Alternatives ) ) ;
    public final void ruleGeometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Geometry__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__Geometry__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Geometry__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__Geometry__Alternatives )
            {
             before(grammarAccess.getGeometryAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__Geometry__Alternatives )
            // InternalDsl.g:119:4: rule__Geometry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Geometry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGeometryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeometry"


    // $ANTLR start "entryRuleLink"
    // InternalDsl.g:128:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleLink EOF )
            // InternalDsl.g:130:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalDsl.g:137:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Link__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Link__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Link__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Link__Group__0 )
            // InternalDsl.g:144:4: rule__Link__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleJoint"
    // InternalDsl.g:153:1: entryRuleJoint : ruleJoint EOF ;
    public final void entryRuleJoint() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleJoint EOF )
            // InternalDsl.g:155:1: ruleJoint EOF
            {
             before(grammarAccess.getJointRule()); 
            pushFollow(FOLLOW_1);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getJointRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoint"


    // $ANTLR start "ruleJoint"
    // InternalDsl.g:162:1: ruleJoint : ( ( rule__Joint__Group__0 ) ) ;
    public final void ruleJoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Joint__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__Joint__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Joint__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__Joint__Group__0 )
            {
             before(grammarAccess.getJointAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__Joint__Group__0 )
            // InternalDsl.g:169:4: rule__Joint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoint"


    // $ANTLR start "entryRuleInertial"
    // InternalDsl.g:178:1: entryRuleInertial : ruleInertial EOF ;
    public final void entryRuleInertial() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleInertial EOF )
            // InternalDsl.g:180:1: ruleInertial EOF
            {
             before(grammarAccess.getInertialRule()); 
            pushFollow(FOLLOW_1);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getInertialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertial"


    // $ANTLR start "ruleInertial"
    // InternalDsl.g:187:1: ruleInertial : ( ( rule__Inertial__Group__0 ) ) ;
    public final void ruleInertial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Inertial__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__Inertial__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Inertial__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__Inertial__Group__0 )
            {
             before(grammarAccess.getInertialAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__Inertial__Group__0 )
            // InternalDsl.g:194:4: rule__Inertial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertial"


    // $ANTLR start "entryRuleVisual"
    // InternalDsl.g:203:1: entryRuleVisual : ruleVisual EOF ;
    public final void entryRuleVisual() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleVisual EOF )
            // InternalDsl.g:205:1: ruleVisual EOF
            {
             before(grammarAccess.getVisualRule()); 
            pushFollow(FOLLOW_1);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getVisualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisual"


    // $ANTLR start "ruleVisual"
    // InternalDsl.g:212:1: ruleVisual : ( ( rule__Visual__Group__0 ) ) ;
    public final void ruleVisual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Visual__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Visual__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Visual__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Visual__Group__0 )
            {
             before(grammarAccess.getVisualAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Visual__Group__0 )
            // InternalDsl.g:219:4: rule__Visual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisual"


    // $ANTLR start "entryRuleCollision"
    // InternalDsl.g:228:1: entryRuleCollision : ruleCollision EOF ;
    public final void entryRuleCollision() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleCollision EOF )
            // InternalDsl.g:230:1: ruleCollision EOF
            {
             before(grammarAccess.getCollisionRule()); 
            pushFollow(FOLLOW_1);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getCollisionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCollision"


    // $ANTLR start "ruleCollision"
    // InternalDsl.g:237:1: ruleCollision : ( ( rule__Collision__Group__0 ) ) ;
    public final void ruleCollision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Collision__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Collision__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Collision__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Collision__Group__0 )
            {
             before(grammarAccess.getCollisionAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Collision__Group__0 )
            // InternalDsl.g:244:4: rule__Collision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCollision"


    // $ANTLR start "entryRuleOrigin"
    // InternalDsl.g:253:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleOrigin EOF )
            // InternalDsl.g:255:1: ruleOrigin EOF
            {
             before(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getOriginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalDsl.g:262:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Origin__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Origin__Group__0 )
            // InternalDsl.g:269:4: rule__Origin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleMass"
    // InternalDsl.g:278:1: entryRuleMass : ruleMass EOF ;
    public final void entryRuleMass() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleMass EOF )
            // InternalDsl.g:280:1: ruleMass EOF
            {
             before(grammarAccess.getMassRule()); 
            pushFollow(FOLLOW_1);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getMassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMass"


    // $ANTLR start "ruleMass"
    // InternalDsl.g:287:1: ruleMass : ( ( rule__Mass__Group__0 ) ) ;
    public final void ruleMass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Mass__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Mass__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Mass__Group__0 )
            {
             before(grammarAccess.getMassAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Mass__Group__0 )
            // InternalDsl.g:294:4: rule__Mass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMass"


    // $ANTLR start "entryRuleInertia"
    // InternalDsl.g:303:1: entryRuleInertia : ruleInertia EOF ;
    public final void entryRuleInertia() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleInertia EOF )
            // InternalDsl.g:305:1: ruleInertia EOF
            {
             before(grammarAccess.getInertiaRule()); 
            pushFollow(FOLLOW_1);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertiaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInertia"


    // $ANTLR start "ruleInertia"
    // InternalDsl.g:312:1: ruleInertia : ( ( rule__Inertia__Group__0 ) ) ;
    public final void ruleInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Inertia__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Inertia__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Inertia__Group__0 )
            {
             before(grammarAccess.getInertiaAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Inertia__Group__0 )
            // InternalDsl.g:319:4: rule__Inertia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInertia"


    // $ANTLR start "entryRuleColor"
    // InternalDsl.g:328:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleColor EOF )
            // InternalDsl.g:330:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalDsl.g:337:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Color__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Color__Group__0 )
            // InternalDsl.g:344:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleTexture"
    // InternalDsl.g:353:1: entryRuleTexture : ruleTexture EOF ;
    public final void entryRuleTexture() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleTexture EOF )
            // InternalDsl.g:355:1: ruleTexture EOF
            {
             before(grammarAccess.getTextureRule()); 
            pushFollow(FOLLOW_1);
            ruleTexture();

            state._fsp--;

             after(grammarAccess.getTextureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTexture"


    // $ANTLR start "ruleTexture"
    // InternalDsl.g:362:1: ruleTexture : ( ( rule__Texture__Group__0 ) ) ;
    public final void ruleTexture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__Texture__Group__0 ) ) )
            // InternalDsl.g:367:2: ( ( rule__Texture__Group__0 ) )
            {
            // InternalDsl.g:367:2: ( ( rule__Texture__Group__0 ) )
            // InternalDsl.g:368:3: ( rule__Texture__Group__0 )
            {
             before(grammarAccess.getTextureAccess().getGroup()); 
            // InternalDsl.g:369:3: ( rule__Texture__Group__0 )
            // InternalDsl.g:369:4: rule__Texture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTexture"


    // $ANTLR start "entryRuleBox"
    // InternalDsl.g:378:1: entryRuleBox : ruleBox EOF ;
    public final void entryRuleBox() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleBox EOF )
            // InternalDsl.g:380:1: ruleBox EOF
            {
             before(grammarAccess.getBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleBox();

            state._fsp--;

             after(grammarAccess.getBoxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBox"


    // $ANTLR start "ruleBox"
    // InternalDsl.g:387:1: ruleBox : ( ( rule__Box__Group__0 ) ) ;
    public final void ruleBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Box__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Box__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Box__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Box__Group__0 )
            {
             before(grammarAccess.getBoxAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Box__Group__0 )
            // InternalDsl.g:394:4: rule__Box__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBox"


    // $ANTLR start "entryRuleCylinder"
    // InternalDsl.g:403:1: entryRuleCylinder : ruleCylinder EOF ;
    public final void entryRuleCylinder() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleCylinder EOF )
            // InternalDsl.g:405:1: ruleCylinder EOF
            {
             before(grammarAccess.getCylinderRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinder();

            state._fsp--;

             after(grammarAccess.getCylinderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCylinder"


    // $ANTLR start "ruleCylinder"
    // InternalDsl.g:412:1: ruleCylinder : ( ( rule__Cylinder__Group__0 ) ) ;
    public final void ruleCylinder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__Cylinder__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__Cylinder__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__Cylinder__Group__0 )
            {
             before(grammarAccess.getCylinderAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__Cylinder__Group__0 )
            // InternalDsl.g:419:4: rule__Cylinder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCylinder"


    // $ANTLR start "entryRuleMesh"
    // InternalDsl.g:428:1: entryRuleMesh : ruleMesh EOF ;
    public final void entryRuleMesh() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleMesh EOF )
            // InternalDsl.g:430:1: ruleMesh EOF
            {
             before(grammarAccess.getMeshRule()); 
            pushFollow(FOLLOW_1);
            ruleMesh();

            state._fsp--;

             after(grammarAccess.getMeshRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMesh"


    // $ANTLR start "ruleMesh"
    // InternalDsl.g:437:1: ruleMesh : ( ( rule__Mesh__Group__0 ) ) ;
    public final void ruleMesh() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Mesh__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Mesh__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Mesh__Group__0 )
            {
             before(grammarAccess.getMeshAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Mesh__Group__0 )
            // InternalDsl.g:444:4: rule__Mesh__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMesh"


    // $ANTLR start "entryRuleSphere"
    // InternalDsl.g:453:1: entryRuleSphere : ruleSphere EOF ;
    public final void entryRuleSphere() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleSphere EOF )
            // InternalDsl.g:455:1: ruleSphere EOF
            {
             before(grammarAccess.getSphereRule()); 
            pushFollow(FOLLOW_1);
            ruleSphere();

            state._fsp--;

             after(grammarAccess.getSphereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSphere"


    // $ANTLR start "ruleSphere"
    // InternalDsl.g:462:1: ruleSphere : ( ( rule__Sphere__Group__0 ) ) ;
    public final void ruleSphere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__Sphere__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__Sphere__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__Sphere__Group__0 )
            {
             before(grammarAccess.getSphereAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__Sphere__Group__0 )
            // InternalDsl.g:469:4: rule__Sphere__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSphere"


    // $ANTLR start "entryRuleLimit"
    // InternalDsl.g:478:1: entryRuleLimit : ruleLimit EOF ;
    public final void entryRuleLimit() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( ruleLimit EOF )
            // InternalDsl.g:480:1: ruleLimit EOF
            {
             before(grammarAccess.getLimitRule()); 
            pushFollow(FOLLOW_1);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getLimitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLimit"


    // $ANTLR start "ruleLimit"
    // InternalDsl.g:487:1: ruleLimit : ( ( rule__Limit__Group__0 ) ) ;
    public final void ruleLimit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__Limit__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__Limit__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__Limit__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__Limit__Group__0 )
            {
             before(grammarAccess.getLimitAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__Limit__Group__0 )
            // InternalDsl.g:494:4: rule__Limit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLimit"


    // $ANTLR start "entryRuleAxis"
    // InternalDsl.g:503:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleAxis EOF )
            // InternalDsl.g:505:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_1);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // InternalDsl.g:512:1: ruleAxis : ( ( rule__Axis__Group__0 ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__Axis__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__Axis__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__Axis__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__Axis__Group__0 )
            {
             before(grammarAccess.getAxisAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__Axis__Group__0 )
            // InternalDsl.g:519:4: rule__Axis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAxis"


    // $ANTLR start "entryRuleCalibration"
    // InternalDsl.g:528:1: entryRuleCalibration : ruleCalibration EOF ;
    public final void entryRuleCalibration() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( ruleCalibration EOF )
            // InternalDsl.g:530:1: ruleCalibration EOF
            {
             before(grammarAccess.getCalibrationRule()); 
            pushFollow(FOLLOW_1);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getCalibrationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalibration"


    // $ANTLR start "ruleCalibration"
    // InternalDsl.g:537:1: ruleCalibration : ( ( rule__Calibration__Group__0 ) ) ;
    public final void ruleCalibration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__Calibration__Group__0 ) ) )
            // InternalDsl.g:542:2: ( ( rule__Calibration__Group__0 ) )
            {
            // InternalDsl.g:542:2: ( ( rule__Calibration__Group__0 ) )
            // InternalDsl.g:543:3: ( rule__Calibration__Group__0 )
            {
             before(grammarAccess.getCalibrationAccess().getGroup()); 
            // InternalDsl.g:544:3: ( rule__Calibration__Group__0 )
            // InternalDsl.g:544:4: rule__Calibration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalibration"


    // $ANTLR start "entryRuleDynamics"
    // InternalDsl.g:553:1: entryRuleDynamics : ruleDynamics EOF ;
    public final void entryRuleDynamics() throws RecognitionException {
        try {
            // InternalDsl.g:554:1: ( ruleDynamics EOF )
            // InternalDsl.g:555:1: ruleDynamics EOF
            {
             before(grammarAccess.getDynamicsRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getDynamicsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDynamics"


    // $ANTLR start "ruleDynamics"
    // InternalDsl.g:562:1: ruleDynamics : ( ( rule__Dynamics__Group__0 ) ) ;
    public final void ruleDynamics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:566:2: ( ( ( rule__Dynamics__Group__0 ) ) )
            // InternalDsl.g:567:2: ( ( rule__Dynamics__Group__0 ) )
            {
            // InternalDsl.g:567:2: ( ( rule__Dynamics__Group__0 ) )
            // InternalDsl.g:568:3: ( rule__Dynamics__Group__0 )
            {
             before(grammarAccess.getDynamicsAccess().getGroup()); 
            // InternalDsl.g:569:3: ( rule__Dynamics__Group__0 )
            // InternalDsl.g:569:4: rule__Dynamics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamics"


    // $ANTLR start "entryRuleMimic"
    // InternalDsl.g:578:1: entryRuleMimic : ruleMimic EOF ;
    public final void entryRuleMimic() throws RecognitionException {
        try {
            // InternalDsl.g:579:1: ( ruleMimic EOF )
            // InternalDsl.g:580:1: ruleMimic EOF
            {
             before(grammarAccess.getMimicRule()); 
            pushFollow(FOLLOW_1);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getMimicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMimic"


    // $ANTLR start "ruleMimic"
    // InternalDsl.g:587:1: ruleMimic : ( ( rule__Mimic__Group__0 ) ) ;
    public final void ruleMimic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:591:2: ( ( ( rule__Mimic__Group__0 ) ) )
            // InternalDsl.g:592:2: ( ( rule__Mimic__Group__0 ) )
            {
            // InternalDsl.g:592:2: ( ( rule__Mimic__Group__0 ) )
            // InternalDsl.g:593:3: ( rule__Mimic__Group__0 )
            {
             before(grammarAccess.getMimicAccess().getGroup()); 
            // InternalDsl.g:594:3: ( rule__Mimic__Group__0 )
            // InternalDsl.g:594:4: rule__Mimic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMimic"


    // $ANTLR start "entryRuleSafetyController"
    // InternalDsl.g:603:1: entryRuleSafetyController : ruleSafetyController EOF ;
    public final void entryRuleSafetyController() throws RecognitionException {
        try {
            // InternalDsl.g:604:1: ( ruleSafetyController EOF )
            // InternalDsl.g:605:1: ruleSafetyController EOF
            {
             before(grammarAccess.getSafetyControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getSafetyControllerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSafetyController"


    // $ANTLR start "ruleSafetyController"
    // InternalDsl.g:612:1: ruleSafetyController : ( ( rule__SafetyController__Group__0 ) ) ;
    public final void ruleSafetyController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:2: ( ( ( rule__SafetyController__Group__0 ) ) )
            // InternalDsl.g:617:2: ( ( rule__SafetyController__Group__0 ) )
            {
            // InternalDsl.g:617:2: ( ( rule__SafetyController__Group__0 ) )
            // InternalDsl.g:618:3: ( rule__SafetyController__Group__0 )
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup()); 
            // InternalDsl.g:619:3: ( rule__SafetyController__Group__0 )
            // InternalDsl.g:619:4: rule__SafetyController__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSafetyController"


    // $ANTLR start "entryRuleFLOAT"
    // InternalDsl.g:628:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // InternalDsl.g:629:1: ( ruleFLOAT EOF )
            // InternalDsl.g:630:1: ruleFLOAT EOF
            {
             before(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getFLOATRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalDsl.g:637:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:641:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // InternalDsl.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            {
            // InternalDsl.g:642:2: ( ( rule__FLOAT__Group__0 ) )
            // InternalDsl.g:643:3: ( rule__FLOAT__Group__0 )
            {
             before(grammarAccess.getFLOATAccess().getGroup()); 
            // InternalDsl.g:644:3: ( rule__FLOAT__Group__0 )
            // InternalDsl.g:644:4: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFLOATAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleSCIENTIFIC"
    // InternalDsl.g:653:1: entryRuleSCIENTIFIC : ruleSCIENTIFIC EOF ;
    public final void entryRuleSCIENTIFIC() throws RecognitionException {
        try {
            // InternalDsl.g:654:1: ( ruleSCIENTIFIC EOF )
            // InternalDsl.g:655:1: ruleSCIENTIFIC EOF
            {
             before(grammarAccess.getSCIENTIFICRule()); 
            pushFollow(FOLLOW_1);
            ruleSCIENTIFIC();

            state._fsp--;

             after(grammarAccess.getSCIENTIFICRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSCIENTIFIC"


    // $ANTLR start "ruleSCIENTIFIC"
    // InternalDsl.g:662:1: ruleSCIENTIFIC : ( ( rule__SCIENTIFIC__Group__0 ) ) ;
    public final void ruleSCIENTIFIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:2: ( ( ( rule__SCIENTIFIC__Group__0 ) ) )
            // InternalDsl.g:667:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            {
            // InternalDsl.g:667:2: ( ( rule__SCIENTIFIC__Group__0 ) )
            // InternalDsl.g:668:3: ( rule__SCIENTIFIC__Group__0 )
            {
             before(grammarAccess.getSCIENTIFICAccess().getGroup()); 
            // InternalDsl.g:669:3: ( rule__SCIENTIFIC__Group__0 )
            // InternalDsl.g:669:4: rule__SCIENTIFIC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSCIENTIFICAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSCIENTIFIC"


    // $ANTLR start "entryRuleSIGNED_NUMERIC"
    // InternalDsl.g:678:1: entryRuleSIGNED_NUMERIC : ruleSIGNED_NUMERIC EOF ;
    public final void entryRuleSIGNED_NUMERIC() throws RecognitionException {
        try {
            // InternalDsl.g:679:1: ( ruleSIGNED_NUMERIC EOF )
            // InternalDsl.g:680:1: ruleSIGNED_NUMERIC EOF
            {
             before(grammarAccess.getSIGNED_NUMERICRule()); 
            pushFollow(FOLLOW_1);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getSIGNED_NUMERICRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSIGNED_NUMERIC"


    // $ANTLR start "ruleSIGNED_NUMERIC"
    // InternalDsl.g:687:1: ruleSIGNED_NUMERIC : ( ( rule__SIGNED_NUMERIC__Group__0 ) ) ;
    public final void ruleSIGNED_NUMERIC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:691:2: ( ( ( rule__SIGNED_NUMERIC__Group__0 ) ) )
            // InternalDsl.g:692:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            {
            // InternalDsl.g:692:2: ( ( rule__SIGNED_NUMERIC__Group__0 ) )
            // InternalDsl.g:693:3: ( rule__SIGNED_NUMERIC__Group__0 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getGroup()); 
            // InternalDsl.g:694:3: ( rule__SIGNED_NUMERIC__Group__0 )
            // InternalDsl.g:694:4: rule__SIGNED_NUMERIC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SIGNED_NUMERIC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSIGNED_NUMERICAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSIGNED_NUMERIC"


    // $ANTLR start "entryRuleMEASURE"
    // InternalDsl.g:703:1: entryRuleMEASURE : ruleMEASURE EOF ;
    public final void entryRuleMEASURE() throws RecognitionException {
        try {
            // InternalDsl.g:704:1: ( ruleMEASURE EOF )
            // InternalDsl.g:705:1: ruleMEASURE EOF
            {
             before(grammarAccess.getMEASURERule()); 
            pushFollow(FOLLOW_1);
            ruleMEASURE();

            state._fsp--;

             after(grammarAccess.getMEASURERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMEASURE"


    // $ANTLR start "ruleMEASURE"
    // InternalDsl.g:712:1: ruleMEASURE : ( ( rule__MEASURE__Alternatives ) ) ;
    public final void ruleMEASURE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:716:2: ( ( ( rule__MEASURE__Alternatives ) ) )
            // InternalDsl.g:717:2: ( ( rule__MEASURE__Alternatives ) )
            {
            // InternalDsl.g:717:2: ( ( rule__MEASURE__Alternatives ) )
            // InternalDsl.g:718:3: ( rule__MEASURE__Alternatives )
            {
             before(grammarAccess.getMEASUREAccess().getAlternatives()); 
            // InternalDsl.g:719:3: ( rule__MEASURE__Alternatives )
            // InternalDsl.g:719:4: rule__MEASURE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MEASURE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMEASUREAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMEASURE"


    // $ANTLR start "ruleJointType"
    // InternalDsl.g:728:1: ruleJointType : ( ( rule__JointType__Alternatives ) ) ;
    public final void ruleJointType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:732:1: ( ( ( rule__JointType__Alternatives ) ) )
            // InternalDsl.g:733:2: ( ( rule__JointType__Alternatives ) )
            {
            // InternalDsl.g:733:2: ( ( rule__JointType__Alternatives ) )
            // InternalDsl.g:734:3: ( rule__JointType__Alternatives )
            {
             before(grammarAccess.getJointTypeAccess().getAlternatives()); 
            // InternalDsl.g:735:3: ( rule__JointType__Alternatives )
            // InternalDsl.g:735:4: rule__JointType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JointType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJointTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJointType"


    // $ANTLR start "rule__Robot__Alternatives_2"
    // InternalDsl.g:743:1: rule__Robot__Alternatives_2 : ( ( ( rule__Robot__LinkAssignment_2_0 ) ) | ( ( rule__Robot__JointAssignment_2_1 ) ) );
    public final void rule__Robot__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:747:1: ( ( ( rule__Robot__LinkAssignment_2_0 ) ) | ( ( rule__Robot__JointAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:748:2: ( ( rule__Robot__LinkAssignment_2_0 ) )
                    {
                    // InternalDsl.g:748:2: ( ( rule__Robot__LinkAssignment_2_0 ) )
                    // InternalDsl.g:749:3: ( rule__Robot__LinkAssignment_2_0 )
                    {
                     before(grammarAccess.getRobotAccess().getLinkAssignment_2_0()); 
                    // InternalDsl.g:750:3: ( rule__Robot__LinkAssignment_2_0 )
                    // InternalDsl.g:750:4: rule__Robot__LinkAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__LinkAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getLinkAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:754:2: ( ( rule__Robot__JointAssignment_2_1 ) )
                    {
                    // InternalDsl.g:754:2: ( ( rule__Robot__JointAssignment_2_1 ) )
                    // InternalDsl.g:755:3: ( rule__Robot__JointAssignment_2_1 )
                    {
                     before(grammarAccess.getRobotAccess().getJointAssignment_2_1()); 
                    // InternalDsl.g:756:3: ( rule__Robot__JointAssignment_2_1 )
                    // InternalDsl.g:756:4: rule__Robot__JointAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__JointAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotAccess().getJointAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Alternatives_2"


    // $ANTLR start "rule__Material__Alternatives"
    // InternalDsl.g:764:1: rule__Material__Alternatives : ( ( ruleColor ) | ( ruleTexture ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:768:1: ( ( ruleColor ) | ( ruleTexture ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==47) ) {
                alt2=1;
            }
            else if ( (LA2_0==49) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:769:2: ( ruleColor )
                    {
                    // InternalDsl.g:769:2: ( ruleColor )
                    // InternalDsl.g:770:3: ruleColor
                    {
                     before(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColor();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getColorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:775:2: ( ruleTexture )
                    {
                    // InternalDsl.g:775:2: ( ruleTexture )
                    // InternalDsl.g:776:3: ruleTexture
                    {
                     before(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTexture();

                    state._fsp--;

                     after(grammarAccess.getMaterialAccess().getTextureParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Alternatives"


    // $ANTLR start "rule__Geometry__Alternatives"
    // InternalDsl.g:785:1: rule__Geometry__Alternatives : ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) );
    public final void rule__Geometry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:789:1: ( ( ruleBox ) | ( ruleCylinder ) | ( ruleMesh ) | ( ruleSphere ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt3=1;
                }
                break;
            case 53:
                {
                alt3=2;
                }
                break;
            case 56:
                {
                alt3=3;
                }
                break;
            case 58:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:790:2: ( ruleBox )
                    {
                    // InternalDsl.g:790:2: ( ruleBox )
                    // InternalDsl.g:791:3: ruleBox
                    {
                     before(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBox();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getBoxParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:796:2: ( ruleCylinder )
                    {
                    // InternalDsl.g:796:2: ( ruleCylinder )
                    // InternalDsl.g:797:3: ruleCylinder
                    {
                     before(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinder();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getCylinderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:802:2: ( ruleMesh )
                    {
                    // InternalDsl.g:802:2: ( ruleMesh )
                    // InternalDsl.g:803:3: ruleMesh
                    {
                     before(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMesh();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getMeshParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:808:2: ( ruleSphere )
                    {
                    // InternalDsl.g:808:2: ( ruleSphere )
                    // InternalDsl.g:809:3: ruleSphere
                    {
                     before(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSphere();

                    state._fsp--;

                     after(grammarAccess.getGeometryAccess().getSphereParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Geometry__Alternatives"


    // $ANTLR start "rule__SCIENTIFIC__Alternatives_2"
    // InternalDsl.g:818:1: rule__SCIENTIFIC__Alternatives_2 : ( ( '+' ) | ( '-' ) );
    public final void rule__SCIENTIFIC__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:822:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:823:2: ( '+' )
                    {
                    // InternalDsl.g:823:2: ( '+' )
                    // InternalDsl.g:824:3: '+'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSCIENTIFICAccess().getPlusSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:829:2: ( '-' )
                    {
                    // InternalDsl.g:829:2: ( '-' )
                    // InternalDsl.g:830:3: '-'
                    {
                     before(grammarAccess.getSCIENTIFICAccess().getHyphenMinusKeyword_2_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSCIENTIFICAccess().getHyphenMinusKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Alternatives_2"


    // $ANTLR start "rule__SIGNED_NUMERIC__Alternatives_1"
    // InternalDsl.g:839:1: rule__SIGNED_NUMERIC__Alternatives_1 : ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) );
    public final void rule__SIGNED_NUMERIC__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:843:1: ( ( RULE_INT ) | ( ruleFLOAT ) | ( ruleSCIENTIFIC ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==74) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==RULE_INT) ) {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==75) ) {
                            alt5=3;
                        }
                        else if ( (LA5_4==EOF||LA5_4==RULE_INT||LA5_4==13||(LA5_4>=19 && LA5_4<=20)||(LA5_4>=25 && LA5_4<=31)||(LA5_4>=33 && LA5_4<=35)||(LA5_4>=37 && LA5_4<=38)||(LA5_4>=42 && LA5_4<=46)||(LA5_4>=60 && LA5_4<=62)||LA5_4==64||LA5_4==66||(LA5_4>=69 && LA5_4<=70)||(LA5_4>=72 && LA5_4<=73)) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_INT||LA5_1==13||(LA5_1>=19 && LA5_1<=20)||(LA5_1>=25 && LA5_1<=31)||(LA5_1>=33 && LA5_1<=35)||(LA5_1>=37 && LA5_1<=38)||(LA5_1>=42 && LA5_1<=46)||(LA5_1>=60 && LA5_1<=62)||LA5_1==64||LA5_1==66||(LA5_1>=69 && LA5_1<=70)||(LA5_1>=72 && LA5_1<=73)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDsl.g:844:2: ( RULE_INT )
                    {
                    // InternalDsl.g:844:2: ( RULE_INT )
                    // InternalDsl.g:845:3: RULE_INT
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getSIGNED_NUMERICAccess().getINTTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:850:2: ( ruleFLOAT )
                    {
                    // InternalDsl.g:850:2: ( ruleFLOAT )
                    // InternalDsl.g:851:3: ruleFLOAT
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getFLOATParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFLOAT();

                    state._fsp--;

                     after(grammarAccess.getSIGNED_NUMERICAccess().getFLOATParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:856:2: ( ruleSCIENTIFIC )
                    {
                    // InternalDsl.g:856:2: ( ruleSCIENTIFIC )
                    // InternalDsl.g:857:3: ruleSCIENTIFIC
                    {
                     before(grammarAccess.getSIGNED_NUMERICAccess().getSCIENTIFICParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSCIENTIFIC();

                    state._fsp--;

                     after(grammarAccess.getSIGNED_NUMERICAccess().getSCIENTIFICParserRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMERIC__Alternatives_1"


    // $ANTLR start "rule__MEASURE__Alternatives"
    // InternalDsl.g:866:1: rule__MEASURE__Alternatives : ( ( RULE_INT ) | ( ruleFLOAT ) );
    public final void rule__MEASURE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:870:1: ( ( RULE_INT ) | ( ruleFLOAT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==RULE_INT||(LA6_1>=19 && LA6_1<=20)||(LA6_1>=30 && LA6_1<=31)||(LA6_1>=33 && LA6_1<=35)||LA6_1==55) ) {
                    alt6=1;
                }
                else if ( (LA6_1==74) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:871:2: ( RULE_INT )
                    {
                    // InternalDsl.g:871:2: ( RULE_INT )
                    // InternalDsl.g:872:3: RULE_INT
                    {
                     before(grammarAccess.getMEASUREAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMEASUREAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:877:2: ( ruleFLOAT )
                    {
                    // InternalDsl.g:877:2: ( ruleFLOAT )
                    // InternalDsl.g:878:3: ruleFLOAT
                    {
                     before(grammarAccess.getMEASUREAccess().getFLOATParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFLOAT();

                    state._fsp--;

                     after(grammarAccess.getMEASUREAccess().getFLOATParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MEASURE__Alternatives"


    // $ANTLR start "rule__JointType__Alternatives"
    // InternalDsl.g:887:1: rule__JointType__Alternatives : ( ( ( 'Fixed' ) ) | ( ( 'Revolute' ) ) | ( ( 'Prismatic' ) ) | ( ( 'Continuous' ) ) );
    public final void rule__JointType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:891:1: ( ( ( 'Fixed' ) ) | ( ( 'Revolute' ) ) | ( ( 'Prismatic' ) ) | ( ( 'Continuous' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:892:2: ( ( 'Fixed' ) )
                    {
                    // InternalDsl.g:892:2: ( ( 'Fixed' ) )
                    // InternalDsl.g:893:3: ( 'Fixed' )
                    {
                     before(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:894:3: ( 'Fixed' )
                    // InternalDsl.g:894:4: 'Fixed'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getFixedEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:898:2: ( ( 'Revolute' ) )
                    {
                    // InternalDsl.g:898:2: ( ( 'Revolute' ) )
                    // InternalDsl.g:899:3: ( 'Revolute' )
                    {
                     before(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:900:3: ( 'Revolute' )
                    // InternalDsl.g:900:4: 'Revolute'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getRevoluteEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:904:2: ( ( 'Prismatic' ) )
                    {
                    // InternalDsl.g:904:2: ( ( 'Prismatic' ) )
                    // InternalDsl.g:905:3: ( 'Prismatic' )
                    {
                     before(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:906:3: ( 'Prismatic' )
                    // InternalDsl.g:906:4: 'Prismatic'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getPrismaticEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:910:2: ( ( 'Continuous' ) )
                    {
                    // InternalDsl.g:910:2: ( ( 'Continuous' ) )
                    // InternalDsl.g:911:3: ( 'Continuous' )
                    {
                     before(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:912:3: ( 'Continuous' )
                    // InternalDsl.g:912:4: 'Continuous'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getJointTypeAccess().getContinuousEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JointType__Alternatives"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalDsl.g:920:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:924:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalDsl.g:925:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalDsl.g:932:1: rule__Robot__Group__0__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:936:1: ( ( 'Robot' ) )
            // InternalDsl.g:937:1: ( 'Robot' )
            {
            // InternalDsl.g:937:1: ( 'Robot' )
            // InternalDsl.g:938:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalDsl.g:947:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:951:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalDsl.g:952:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalDsl.g:959:1: rule__Robot__Group__1__Impl : ( ( rule__Robot__NameAssignment_1 ) ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:963:1: ( ( ( rule__Robot__NameAssignment_1 ) ) )
            // InternalDsl.g:964:1: ( ( rule__Robot__NameAssignment_1 ) )
            {
            // InternalDsl.g:964:1: ( ( rule__Robot__NameAssignment_1 ) )
            // InternalDsl.g:965:2: ( rule__Robot__NameAssignment_1 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_1()); 
            // InternalDsl.g:966:2: ( rule__Robot__NameAssignment_1 )
            // InternalDsl.g:966:3: rule__Robot__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalDsl.g:974:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:978:1: ( rule__Robot__Group__2__Impl )
            // InternalDsl.g:979:2: rule__Robot__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalDsl.g:985:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__Alternatives_2 )* ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:989:1: ( ( ( rule__Robot__Alternatives_2 )* ) )
            // InternalDsl.g:990:1: ( ( rule__Robot__Alternatives_2 )* )
            {
            // InternalDsl.g:990:1: ( ( rule__Robot__Alternatives_2 )* )
            // InternalDsl.g:991:2: ( rule__Robot__Alternatives_2 )*
            {
             before(grammarAccess.getRobotAccess().getAlternatives_2()); 
            // InternalDsl.g:992:2: ( rule__Robot__Alternatives_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:992:3: rule__Robot__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Robot__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__0"
    // InternalDsl.g:1001:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1005:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // InternalDsl.g:1006:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Link__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0"


    // $ANTLR start "rule__Link__Group__0__Impl"
    // InternalDsl.g:1013:1: rule__Link__Group__0__Impl : ( 'Link' ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1017:1: ( ( 'Link' ) )
            // InternalDsl.g:1018:1: ( 'Link' )
            {
            // InternalDsl.g:1018:1: ( 'Link' )
            // InternalDsl.g:1019:2: 'Link'
            {
             before(grammarAccess.getLinkAccess().getLinkKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__0__Impl"


    // $ANTLR start "rule__Link__Group__1"
    // InternalDsl.g:1028:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1032:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // InternalDsl.g:1033:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Link__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1"


    // $ANTLR start "rule__Link__Group__1__Impl"
    // InternalDsl.g:1040:1: rule__Link__Group__1__Impl : ( ( rule__Link__NameAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1044:1: ( ( ( rule__Link__NameAssignment_1 ) ) )
            // InternalDsl.g:1045:1: ( ( rule__Link__NameAssignment_1 ) )
            {
            // InternalDsl.g:1045:1: ( ( rule__Link__NameAssignment_1 ) )
            // InternalDsl.g:1046:2: ( rule__Link__NameAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getNameAssignment_1()); 
            // InternalDsl.g:1047:2: ( rule__Link__NameAssignment_1 )
            // InternalDsl.g:1047:3: rule__Link__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Link__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__1__Impl"


    // $ANTLR start "rule__Link__Group__2"
    // InternalDsl.g:1055:1: rule__Link__Group__2 : rule__Link__Group__2__Impl rule__Link__Group__3 ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1059:1: ( rule__Link__Group__2__Impl rule__Link__Group__3 )
            // InternalDsl.g:1060:2: rule__Link__Group__2__Impl rule__Link__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Link__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2"


    // $ANTLR start "rule__Link__Group__2__Impl"
    // InternalDsl.g:1067:1: rule__Link__Group__2__Impl : ( ( rule__Link__VisualsAssignment_2 )* ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1071:1: ( ( ( rule__Link__VisualsAssignment_2 )* ) )
            // InternalDsl.g:1072:1: ( ( rule__Link__VisualsAssignment_2 )* )
            {
            // InternalDsl.g:1072:1: ( ( rule__Link__VisualsAssignment_2 )* )
            // InternalDsl.g:1073:2: ( rule__Link__VisualsAssignment_2 )*
            {
             before(grammarAccess.getLinkAccess().getVisualsAssignment_2()); 
            // InternalDsl.g:1074:2: ( rule__Link__VisualsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:1074:3: rule__Link__VisualsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Link__VisualsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getVisualsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__2__Impl"


    // $ANTLR start "rule__Link__Group__3"
    // InternalDsl.g:1082:1: rule__Link__Group__3 : rule__Link__Group__3__Impl rule__Link__Group__4 ;
    public final void rule__Link__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1086:1: ( rule__Link__Group__3__Impl rule__Link__Group__4 )
            // InternalDsl.g:1087:2: rule__Link__Group__3__Impl rule__Link__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Link__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Link__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3"


    // $ANTLR start "rule__Link__Group__3__Impl"
    // InternalDsl.g:1094:1: rule__Link__Group__3__Impl : ( ( rule__Link__InertialAssignment_3 )* ) ;
    public final void rule__Link__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1098:1: ( ( ( rule__Link__InertialAssignment_3 )* ) )
            // InternalDsl.g:1099:1: ( ( rule__Link__InertialAssignment_3 )* )
            {
            // InternalDsl.g:1099:1: ( ( rule__Link__InertialAssignment_3 )* )
            // InternalDsl.g:1100:2: ( rule__Link__InertialAssignment_3 )*
            {
             before(grammarAccess.getLinkAccess().getInertialAssignment_3()); 
            // InternalDsl.g:1101:2: ( rule__Link__InertialAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:1101:3: rule__Link__InertialAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Link__InertialAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getInertialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__3__Impl"


    // $ANTLR start "rule__Link__Group__4"
    // InternalDsl.g:1109:1: rule__Link__Group__4 : rule__Link__Group__4__Impl ;
    public final void rule__Link__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1113:1: ( rule__Link__Group__4__Impl )
            // InternalDsl.g:1114:2: rule__Link__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Link__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4"


    // $ANTLR start "rule__Link__Group__4__Impl"
    // InternalDsl.g:1120:1: rule__Link__Group__4__Impl : ( ( rule__Link__CollisionAssignment_4 )* ) ;
    public final void rule__Link__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1124:1: ( ( ( rule__Link__CollisionAssignment_4 )* ) )
            // InternalDsl.g:1125:1: ( ( rule__Link__CollisionAssignment_4 )* )
            {
            // InternalDsl.g:1125:1: ( ( rule__Link__CollisionAssignment_4 )* )
            // InternalDsl.g:1126:2: ( rule__Link__CollisionAssignment_4 )*
            {
             before(grammarAccess.getLinkAccess().getCollisionAssignment_4()); 
            // InternalDsl.g:1127:2: ( rule__Link__CollisionAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1127:3: rule__Link__CollisionAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Link__CollisionAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLinkAccess().getCollisionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__0"
    // InternalDsl.g:1136:1: rule__Joint__Group__0 : rule__Joint__Group__0__Impl rule__Joint__Group__1 ;
    public final void rule__Joint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1140:1: ( rule__Joint__Group__0__Impl rule__Joint__Group__1 )
            // InternalDsl.g:1141:2: rule__Joint__Group__0__Impl rule__Joint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0"


    // $ANTLR start "rule__Joint__Group__0__Impl"
    // InternalDsl.g:1148:1: rule__Joint__Group__0__Impl : ( 'Joint' ) ;
    public final void rule__Joint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1152:1: ( ( 'Joint' ) )
            // InternalDsl.g:1153:1: ( 'Joint' )
            {
            // InternalDsl.g:1153:1: ( 'Joint' )
            // InternalDsl.g:1154:2: 'Joint'
            {
             before(grammarAccess.getJointAccess().getJointKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getJointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__0__Impl"


    // $ANTLR start "rule__Joint__Group__1"
    // InternalDsl.g:1163:1: rule__Joint__Group__1 : rule__Joint__Group__1__Impl rule__Joint__Group__2 ;
    public final void rule__Joint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1167:1: ( rule__Joint__Group__1__Impl rule__Joint__Group__2 )
            // InternalDsl.g:1168:2: rule__Joint__Group__1__Impl rule__Joint__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Joint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1"


    // $ANTLR start "rule__Joint__Group__1__Impl"
    // InternalDsl.g:1175:1: rule__Joint__Group__1__Impl : ( ( rule__Joint__NameAssignment_1 ) ) ;
    public final void rule__Joint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1179:1: ( ( ( rule__Joint__NameAssignment_1 ) ) )
            // InternalDsl.g:1180:1: ( ( rule__Joint__NameAssignment_1 ) )
            {
            // InternalDsl.g:1180:1: ( ( rule__Joint__NameAssignment_1 ) )
            // InternalDsl.g:1181:2: ( rule__Joint__NameAssignment_1 )
            {
             before(grammarAccess.getJointAccess().getNameAssignment_1()); 
            // InternalDsl.g:1182:2: ( rule__Joint__NameAssignment_1 )
            // InternalDsl.g:1182:3: rule__Joint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__1__Impl"


    // $ANTLR start "rule__Joint__Group__2"
    // InternalDsl.g:1190:1: rule__Joint__Group__2 : rule__Joint__Group__2__Impl rule__Joint__Group__3 ;
    public final void rule__Joint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1194:1: ( rule__Joint__Group__2__Impl rule__Joint__Group__3 )
            // InternalDsl.g:1195:2: rule__Joint__Group__2__Impl rule__Joint__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Joint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2"


    // $ANTLR start "rule__Joint__Group__2__Impl"
    // InternalDsl.g:1202:1: rule__Joint__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Joint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1206:1: ( ( 'Type' ) )
            // InternalDsl.g:1207:1: ( 'Type' )
            {
            // InternalDsl.g:1207:1: ( 'Type' )
            // InternalDsl.g:1208:2: 'Type'
            {
             before(grammarAccess.getJointAccess().getTypeKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__2__Impl"


    // $ANTLR start "rule__Joint__Group__3"
    // InternalDsl.g:1217:1: rule__Joint__Group__3 : rule__Joint__Group__3__Impl rule__Joint__Group__4 ;
    public final void rule__Joint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1221:1: ( rule__Joint__Group__3__Impl rule__Joint__Group__4 )
            // InternalDsl.g:1222:2: rule__Joint__Group__3__Impl rule__Joint__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Joint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3"


    // $ANTLR start "rule__Joint__Group__3__Impl"
    // InternalDsl.g:1229:1: rule__Joint__Group__3__Impl : ( ( rule__Joint__TypeAssignment_3 ) ) ;
    public final void rule__Joint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1233:1: ( ( ( rule__Joint__TypeAssignment_3 ) ) )
            // InternalDsl.g:1234:1: ( ( rule__Joint__TypeAssignment_3 ) )
            {
            // InternalDsl.g:1234:1: ( ( rule__Joint__TypeAssignment_3 ) )
            // InternalDsl.g:1235:2: ( rule__Joint__TypeAssignment_3 )
            {
             before(grammarAccess.getJointAccess().getTypeAssignment_3()); 
            // InternalDsl.g:1236:2: ( rule__Joint__TypeAssignment_3 )
            // InternalDsl.g:1236:3: rule__Joint__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Joint__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__3__Impl"


    // $ANTLR start "rule__Joint__Group__4"
    // InternalDsl.g:1244:1: rule__Joint__Group__4 : rule__Joint__Group__4__Impl rule__Joint__Group__5 ;
    public final void rule__Joint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1248:1: ( rule__Joint__Group__4__Impl rule__Joint__Group__5 )
            // InternalDsl.g:1249:2: rule__Joint__Group__4__Impl rule__Joint__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4"


    // $ANTLR start "rule__Joint__Group__4__Impl"
    // InternalDsl.g:1256:1: rule__Joint__Group__4__Impl : ( 'ChildOf' ) ;
    public final void rule__Joint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1260:1: ( ( 'ChildOf' ) )
            // InternalDsl.g:1261:1: ( 'ChildOf' )
            {
            // InternalDsl.g:1261:1: ( 'ChildOf' )
            // InternalDsl.g:1262:2: 'ChildOf'
            {
             before(grammarAccess.getJointAccess().getChildOfKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__4__Impl"


    // $ANTLR start "rule__Joint__Group__5"
    // InternalDsl.g:1271:1: rule__Joint__Group__5 : rule__Joint__Group__5__Impl rule__Joint__Group__6 ;
    public final void rule__Joint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1275:1: ( rule__Joint__Group__5__Impl rule__Joint__Group__6 )
            // InternalDsl.g:1276:2: rule__Joint__Group__5__Impl rule__Joint__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Joint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5"


    // $ANTLR start "rule__Joint__Group__5__Impl"
    // InternalDsl.g:1283:1: rule__Joint__Group__5__Impl : ( ( rule__Joint__ChildOfAssignment_5 ) ) ;
    public final void rule__Joint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1287:1: ( ( ( rule__Joint__ChildOfAssignment_5 ) ) )
            // InternalDsl.g:1288:1: ( ( rule__Joint__ChildOfAssignment_5 ) )
            {
            // InternalDsl.g:1288:1: ( ( rule__Joint__ChildOfAssignment_5 ) )
            // InternalDsl.g:1289:2: ( rule__Joint__ChildOfAssignment_5 )
            {
             before(grammarAccess.getJointAccess().getChildOfAssignment_5()); 
            // InternalDsl.g:1290:2: ( rule__Joint__ChildOfAssignment_5 )
            // InternalDsl.g:1290:3: rule__Joint__ChildOfAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ChildOfAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getChildOfAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__5__Impl"


    // $ANTLR start "rule__Joint__Group__6"
    // InternalDsl.g:1298:1: rule__Joint__Group__6 : rule__Joint__Group__6__Impl rule__Joint__Group__7 ;
    public final void rule__Joint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1302:1: ( rule__Joint__Group__6__Impl rule__Joint__Group__7 )
            // InternalDsl.g:1303:2: rule__Joint__Group__6__Impl rule__Joint__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Joint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6"


    // $ANTLR start "rule__Joint__Group__6__Impl"
    // InternalDsl.g:1310:1: rule__Joint__Group__6__Impl : ( 'ParentOf' ) ;
    public final void rule__Joint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1314:1: ( ( 'ParentOf' ) )
            // InternalDsl.g:1315:1: ( 'ParentOf' )
            {
            // InternalDsl.g:1315:1: ( 'ParentOf' )
            // InternalDsl.g:1316:2: 'ParentOf'
            {
             before(grammarAccess.getJointAccess().getParentOfKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__6__Impl"


    // $ANTLR start "rule__Joint__Group__7"
    // InternalDsl.g:1325:1: rule__Joint__Group__7 : rule__Joint__Group__7__Impl rule__Joint__Group__8 ;
    public final void rule__Joint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1329:1: ( rule__Joint__Group__7__Impl rule__Joint__Group__8 )
            // InternalDsl.g:1330:2: rule__Joint__Group__7__Impl rule__Joint__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7"


    // $ANTLR start "rule__Joint__Group__7__Impl"
    // InternalDsl.g:1337:1: rule__Joint__Group__7__Impl : ( ( rule__Joint__ParentOfAssignment_7 ) ) ;
    public final void rule__Joint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1341:1: ( ( ( rule__Joint__ParentOfAssignment_7 ) ) )
            // InternalDsl.g:1342:1: ( ( rule__Joint__ParentOfAssignment_7 ) )
            {
            // InternalDsl.g:1342:1: ( ( rule__Joint__ParentOfAssignment_7 ) )
            // InternalDsl.g:1343:2: ( rule__Joint__ParentOfAssignment_7 )
            {
             before(grammarAccess.getJointAccess().getParentOfAssignment_7()); 
            // InternalDsl.g:1344:2: ( rule__Joint__ParentOfAssignment_7 )
            // InternalDsl.g:1344:3: rule__Joint__ParentOfAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Joint__ParentOfAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getParentOfAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__7__Impl"


    // $ANTLR start "rule__Joint__Group__8"
    // InternalDsl.g:1352:1: rule__Joint__Group__8 : rule__Joint__Group__8__Impl rule__Joint__Group__9 ;
    public final void rule__Joint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1356:1: ( rule__Joint__Group__8__Impl rule__Joint__Group__9 )
            // InternalDsl.g:1357:2: rule__Joint__Group__8__Impl rule__Joint__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8"


    // $ANTLR start "rule__Joint__Group__8__Impl"
    // InternalDsl.g:1364:1: rule__Joint__Group__8__Impl : ( ( rule__Joint__Group_8__0 )? ) ;
    public final void rule__Joint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1368:1: ( ( ( rule__Joint__Group_8__0 )? ) )
            // InternalDsl.g:1369:1: ( ( rule__Joint__Group_8__0 )? )
            {
            // InternalDsl.g:1369:1: ( ( rule__Joint__Group_8__0 )? )
            // InternalDsl.g:1370:2: ( rule__Joint__Group_8__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_8()); 
            // InternalDsl.g:1371:2: ( rule__Joint__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1371:3: rule__Joint__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__8__Impl"


    // $ANTLR start "rule__Joint__Group__9"
    // InternalDsl.g:1379:1: rule__Joint__Group__9 : rule__Joint__Group__9__Impl rule__Joint__Group__10 ;
    public final void rule__Joint__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1383:1: ( rule__Joint__Group__9__Impl rule__Joint__Group__10 )
            // InternalDsl.g:1384:2: rule__Joint__Group__9__Impl rule__Joint__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9"


    // $ANTLR start "rule__Joint__Group__9__Impl"
    // InternalDsl.g:1391:1: rule__Joint__Group__9__Impl : ( ( rule__Joint__Group_9__0 )? ) ;
    public final void rule__Joint__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1395:1: ( ( ( rule__Joint__Group_9__0 )? ) )
            // InternalDsl.g:1396:1: ( ( rule__Joint__Group_9__0 )? )
            {
            // InternalDsl.g:1396:1: ( ( rule__Joint__Group_9__0 )? )
            // InternalDsl.g:1397:2: ( rule__Joint__Group_9__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_9()); 
            // InternalDsl.g:1398:2: ( rule__Joint__Group_9__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1398:3: rule__Joint__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__9__Impl"


    // $ANTLR start "rule__Joint__Group__10"
    // InternalDsl.g:1406:1: rule__Joint__Group__10 : rule__Joint__Group__10__Impl rule__Joint__Group__11 ;
    public final void rule__Joint__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1410:1: ( rule__Joint__Group__10__Impl rule__Joint__Group__11 )
            // InternalDsl.g:1411:2: rule__Joint__Group__10__Impl rule__Joint__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10"


    // $ANTLR start "rule__Joint__Group__10__Impl"
    // InternalDsl.g:1418:1: rule__Joint__Group__10__Impl : ( ( rule__Joint__OriginAssignment_10 )? ) ;
    public final void rule__Joint__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1422:1: ( ( ( rule__Joint__OriginAssignment_10 )? ) )
            // InternalDsl.g:1423:1: ( ( rule__Joint__OriginAssignment_10 )? )
            {
            // InternalDsl.g:1423:1: ( ( rule__Joint__OriginAssignment_10 )? )
            // InternalDsl.g:1424:2: ( rule__Joint__OriginAssignment_10 )?
            {
             before(grammarAccess.getJointAccess().getOriginAssignment_10()); 
            // InternalDsl.g:1425:2: ( rule__Joint__OriginAssignment_10 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1425:3: rule__Joint__OriginAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__OriginAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getOriginAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__10__Impl"


    // $ANTLR start "rule__Joint__Group__11"
    // InternalDsl.g:1433:1: rule__Joint__Group__11 : rule__Joint__Group__11__Impl rule__Joint__Group__12 ;
    public final void rule__Joint__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1437:1: ( rule__Joint__Group__11__Impl rule__Joint__Group__12 )
            // InternalDsl.g:1438:2: rule__Joint__Group__11__Impl rule__Joint__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11"


    // $ANTLR start "rule__Joint__Group__11__Impl"
    // InternalDsl.g:1445:1: rule__Joint__Group__11__Impl : ( ( rule__Joint__Group_11__0 )? ) ;
    public final void rule__Joint__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1449:1: ( ( ( rule__Joint__Group_11__0 )? ) )
            // InternalDsl.g:1450:1: ( ( rule__Joint__Group_11__0 )? )
            {
            // InternalDsl.g:1450:1: ( ( rule__Joint__Group_11__0 )? )
            // InternalDsl.g:1451:2: ( rule__Joint__Group_11__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_11()); 
            // InternalDsl.g:1452:2: ( rule__Joint__Group_11__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1452:3: rule__Joint__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__11__Impl"


    // $ANTLR start "rule__Joint__Group__12"
    // InternalDsl.g:1460:1: rule__Joint__Group__12 : rule__Joint__Group__12__Impl rule__Joint__Group__13 ;
    public final void rule__Joint__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1464:1: ( rule__Joint__Group__12__Impl rule__Joint__Group__13 )
            // InternalDsl.g:1465:2: rule__Joint__Group__12__Impl rule__Joint__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__12"


    // $ANTLR start "rule__Joint__Group__12__Impl"
    // InternalDsl.g:1472:1: rule__Joint__Group__12__Impl : ( ( rule__Joint__Group_12__0 )? ) ;
    public final void rule__Joint__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1476:1: ( ( ( rule__Joint__Group_12__0 )? ) )
            // InternalDsl.g:1477:1: ( ( rule__Joint__Group_12__0 )? )
            {
            // InternalDsl.g:1477:1: ( ( rule__Joint__Group_12__0 )? )
            // InternalDsl.g:1478:2: ( rule__Joint__Group_12__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_12()); 
            // InternalDsl.g:1479:2: ( rule__Joint__Group_12__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1479:3: rule__Joint__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__12__Impl"


    // $ANTLR start "rule__Joint__Group__13"
    // InternalDsl.g:1487:1: rule__Joint__Group__13 : rule__Joint__Group__13__Impl rule__Joint__Group__14 ;
    public final void rule__Joint__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1491:1: ( rule__Joint__Group__13__Impl rule__Joint__Group__14 )
            // InternalDsl.g:1492:2: rule__Joint__Group__13__Impl rule__Joint__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Joint__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__13"


    // $ANTLR start "rule__Joint__Group__13__Impl"
    // InternalDsl.g:1499:1: rule__Joint__Group__13__Impl : ( ( rule__Joint__Group_13__0 )? ) ;
    public final void rule__Joint__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1503:1: ( ( ( rule__Joint__Group_13__0 )? ) )
            // InternalDsl.g:1504:1: ( ( rule__Joint__Group_13__0 )? )
            {
            // InternalDsl.g:1504:1: ( ( rule__Joint__Group_13__0 )? )
            // InternalDsl.g:1505:2: ( rule__Joint__Group_13__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_13()); 
            // InternalDsl.g:1506:2: ( rule__Joint__Group_13__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1506:3: rule__Joint__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__13__Impl"


    // $ANTLR start "rule__Joint__Group__14"
    // InternalDsl.g:1514:1: rule__Joint__Group__14 : rule__Joint__Group__14__Impl ;
    public final void rule__Joint__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1518:1: ( rule__Joint__Group__14__Impl )
            // InternalDsl.g:1519:2: rule__Joint__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__14"


    // $ANTLR start "rule__Joint__Group__14__Impl"
    // InternalDsl.g:1525:1: rule__Joint__Group__14__Impl : ( ( rule__Joint__Group_14__0 )? ) ;
    public final void rule__Joint__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1529:1: ( ( ( rule__Joint__Group_14__0 )? ) )
            // InternalDsl.g:1530:1: ( ( rule__Joint__Group_14__0 )? )
            {
            // InternalDsl.g:1530:1: ( ( rule__Joint__Group_14__0 )? )
            // InternalDsl.g:1531:2: ( rule__Joint__Group_14__0 )?
            {
             before(grammarAccess.getJointAccess().getGroup_14()); 
            // InternalDsl.g:1532:2: ( rule__Joint__Group_14__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1532:3: rule__Joint__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Joint__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJointAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group__14__Impl"


    // $ANTLR start "rule__Joint__Group_8__0"
    // InternalDsl.g:1541:1: rule__Joint__Group_8__0 : rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 ;
    public final void rule__Joint__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1545:1: ( rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1 )
            // InternalDsl.g:1546:2: rule__Joint__Group_8__0__Impl rule__Joint__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__Joint__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0"


    // $ANTLR start "rule__Joint__Group_8__0__Impl"
    // InternalDsl.g:1553:1: rule__Joint__Group_8__0__Impl : ( 'Limit' ) ;
    public final void rule__Joint__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1557:1: ( ( 'Limit' ) )
            // InternalDsl.g:1558:1: ( 'Limit' )
            {
            // InternalDsl.g:1558:1: ( 'Limit' )
            // InternalDsl.g:1559:2: 'Limit'
            {
             before(grammarAccess.getJointAccess().getLimitKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getLimitKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__0__Impl"


    // $ANTLR start "rule__Joint__Group_8__1"
    // InternalDsl.g:1568:1: rule__Joint__Group_8__1 : rule__Joint__Group_8__1__Impl ;
    public final void rule__Joint__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1572:1: ( rule__Joint__Group_8__1__Impl )
            // InternalDsl.g:1573:2: rule__Joint__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1"


    // $ANTLR start "rule__Joint__Group_8__1__Impl"
    // InternalDsl.g:1579:1: rule__Joint__Group_8__1__Impl : ( ( rule__Joint__LimitAssignment_8_1 ) ) ;
    public final void rule__Joint__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1583:1: ( ( ( rule__Joint__LimitAssignment_8_1 ) ) )
            // InternalDsl.g:1584:1: ( ( rule__Joint__LimitAssignment_8_1 ) )
            {
            // InternalDsl.g:1584:1: ( ( rule__Joint__LimitAssignment_8_1 ) )
            // InternalDsl.g:1585:2: ( rule__Joint__LimitAssignment_8_1 )
            {
             before(grammarAccess.getJointAccess().getLimitAssignment_8_1()); 
            // InternalDsl.g:1586:2: ( rule__Joint__LimitAssignment_8_1 )
            // InternalDsl.g:1586:3: rule__Joint__LimitAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__LimitAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getLimitAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_8__1__Impl"


    // $ANTLR start "rule__Joint__Group_9__0"
    // InternalDsl.g:1595:1: rule__Joint__Group_9__0 : rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1 ;
    public final void rule__Joint__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1599:1: ( rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1 )
            // InternalDsl.g:1600:2: rule__Joint__Group_9__0__Impl rule__Joint__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__Joint__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__0"


    // $ANTLR start "rule__Joint__Group_9__0__Impl"
    // InternalDsl.g:1607:1: rule__Joint__Group_9__0__Impl : ( 'Axis' ) ;
    public final void rule__Joint__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1611:1: ( ( 'Axis' ) )
            // InternalDsl.g:1612:1: ( 'Axis' )
            {
            // InternalDsl.g:1612:1: ( 'Axis' )
            // InternalDsl.g:1613:2: 'Axis'
            {
             before(grammarAccess.getJointAccess().getAxisKeyword_9_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getAxisKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__0__Impl"


    // $ANTLR start "rule__Joint__Group_9__1"
    // InternalDsl.g:1622:1: rule__Joint__Group_9__1 : rule__Joint__Group_9__1__Impl ;
    public final void rule__Joint__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1626:1: ( rule__Joint__Group_9__1__Impl )
            // InternalDsl.g:1627:2: rule__Joint__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__1"


    // $ANTLR start "rule__Joint__Group_9__1__Impl"
    // InternalDsl.g:1633:1: rule__Joint__Group_9__1__Impl : ( ( rule__Joint__AxisAssignment_9_1 ) ) ;
    public final void rule__Joint__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1637:1: ( ( ( rule__Joint__AxisAssignment_9_1 ) ) )
            // InternalDsl.g:1638:1: ( ( rule__Joint__AxisAssignment_9_1 ) )
            {
            // InternalDsl.g:1638:1: ( ( rule__Joint__AxisAssignment_9_1 ) )
            // InternalDsl.g:1639:2: ( rule__Joint__AxisAssignment_9_1 )
            {
             before(grammarAccess.getJointAccess().getAxisAssignment_9_1()); 
            // InternalDsl.g:1640:2: ( rule__Joint__AxisAssignment_9_1 )
            // InternalDsl.g:1640:3: rule__Joint__AxisAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__AxisAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getAxisAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_9__1__Impl"


    // $ANTLR start "rule__Joint__Group_11__0"
    // InternalDsl.g:1649:1: rule__Joint__Group_11__0 : rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 ;
    public final void rule__Joint__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1653:1: ( rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1 )
            // InternalDsl.g:1654:2: rule__Joint__Group_11__0__Impl rule__Joint__Group_11__1
            {
            pushFollow(FOLLOW_17);
            rule__Joint__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__0"


    // $ANTLR start "rule__Joint__Group_11__0__Impl"
    // InternalDsl.g:1661:1: rule__Joint__Group_11__0__Impl : ( 'Calibration' ) ;
    public final void rule__Joint__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1665:1: ( ( 'Calibration' ) )
            // InternalDsl.g:1666:1: ( 'Calibration' )
            {
            // InternalDsl.g:1666:1: ( 'Calibration' )
            // InternalDsl.g:1667:2: 'Calibration'
            {
             before(grammarAccess.getJointAccess().getCalibrationKeyword_11_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getCalibrationKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__0__Impl"


    // $ANTLR start "rule__Joint__Group_11__1"
    // InternalDsl.g:1676:1: rule__Joint__Group_11__1 : rule__Joint__Group_11__1__Impl ;
    public final void rule__Joint__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1680:1: ( rule__Joint__Group_11__1__Impl )
            // InternalDsl.g:1681:2: rule__Joint__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__1"


    // $ANTLR start "rule__Joint__Group_11__1__Impl"
    // InternalDsl.g:1687:1: rule__Joint__Group_11__1__Impl : ( ( rule__Joint__CalibrationAssignment_11_1 ) ) ;
    public final void rule__Joint__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1691:1: ( ( ( rule__Joint__CalibrationAssignment_11_1 ) ) )
            // InternalDsl.g:1692:1: ( ( rule__Joint__CalibrationAssignment_11_1 ) )
            {
            // InternalDsl.g:1692:1: ( ( rule__Joint__CalibrationAssignment_11_1 ) )
            // InternalDsl.g:1693:2: ( rule__Joint__CalibrationAssignment_11_1 )
            {
             before(grammarAccess.getJointAccess().getCalibrationAssignment_11_1()); 
            // InternalDsl.g:1694:2: ( rule__Joint__CalibrationAssignment_11_1 )
            // InternalDsl.g:1694:3: rule__Joint__CalibrationAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__CalibrationAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getCalibrationAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_11__1__Impl"


    // $ANTLR start "rule__Joint__Group_12__0"
    // InternalDsl.g:1703:1: rule__Joint__Group_12__0 : rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 ;
    public final void rule__Joint__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1707:1: ( rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1 )
            // InternalDsl.g:1708:2: rule__Joint__Group_12__0__Impl rule__Joint__Group_12__1
            {
            pushFollow(FOLLOW_18);
            rule__Joint__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__0"


    // $ANTLR start "rule__Joint__Group_12__0__Impl"
    // InternalDsl.g:1715:1: rule__Joint__Group_12__0__Impl : ( 'Dynamics' ) ;
    public final void rule__Joint__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1719:1: ( ( 'Dynamics' ) )
            // InternalDsl.g:1720:1: ( 'Dynamics' )
            {
            // InternalDsl.g:1720:1: ( 'Dynamics' )
            // InternalDsl.g:1721:2: 'Dynamics'
            {
             before(grammarAccess.getJointAccess().getDynamicsKeyword_12_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getDynamicsKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__0__Impl"


    // $ANTLR start "rule__Joint__Group_12__1"
    // InternalDsl.g:1730:1: rule__Joint__Group_12__1 : rule__Joint__Group_12__1__Impl ;
    public final void rule__Joint__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1734:1: ( rule__Joint__Group_12__1__Impl )
            // InternalDsl.g:1735:2: rule__Joint__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__1"


    // $ANTLR start "rule__Joint__Group_12__1__Impl"
    // InternalDsl.g:1741:1: rule__Joint__Group_12__1__Impl : ( ( rule__Joint__DynamicsAssignment_12_1 ) ) ;
    public final void rule__Joint__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1745:1: ( ( ( rule__Joint__DynamicsAssignment_12_1 ) ) )
            // InternalDsl.g:1746:1: ( ( rule__Joint__DynamicsAssignment_12_1 ) )
            {
            // InternalDsl.g:1746:1: ( ( rule__Joint__DynamicsAssignment_12_1 ) )
            // InternalDsl.g:1747:2: ( rule__Joint__DynamicsAssignment_12_1 )
            {
             before(grammarAccess.getJointAccess().getDynamicsAssignment_12_1()); 
            // InternalDsl.g:1748:2: ( rule__Joint__DynamicsAssignment_12_1 )
            // InternalDsl.g:1748:3: rule__Joint__DynamicsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__DynamicsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getDynamicsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_12__1__Impl"


    // $ANTLR start "rule__Joint__Group_13__0"
    // InternalDsl.g:1757:1: rule__Joint__Group_13__0 : rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 ;
    public final void rule__Joint__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1761:1: ( rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1 )
            // InternalDsl.g:1762:2: rule__Joint__Group_13__0__Impl rule__Joint__Group_13__1
            {
            pushFollow(FOLLOW_19);
            rule__Joint__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__0"


    // $ANTLR start "rule__Joint__Group_13__0__Impl"
    // InternalDsl.g:1769:1: rule__Joint__Group_13__0__Impl : ( 'Mimic' ) ;
    public final void rule__Joint__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1773:1: ( ( 'Mimic' ) )
            // InternalDsl.g:1774:1: ( 'Mimic' )
            {
            // InternalDsl.g:1774:1: ( 'Mimic' )
            // InternalDsl.g:1775:2: 'Mimic'
            {
             before(grammarAccess.getJointAccess().getMimicKeyword_13_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getMimicKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__0__Impl"


    // $ANTLR start "rule__Joint__Group_13__1"
    // InternalDsl.g:1784:1: rule__Joint__Group_13__1 : rule__Joint__Group_13__1__Impl ;
    public final void rule__Joint__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1788:1: ( rule__Joint__Group_13__1__Impl )
            // InternalDsl.g:1789:2: rule__Joint__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__1"


    // $ANTLR start "rule__Joint__Group_13__1__Impl"
    // InternalDsl.g:1795:1: rule__Joint__Group_13__1__Impl : ( ( rule__Joint__MimicAssignment_13_1 ) ) ;
    public final void rule__Joint__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1799:1: ( ( ( rule__Joint__MimicAssignment_13_1 ) ) )
            // InternalDsl.g:1800:1: ( ( rule__Joint__MimicAssignment_13_1 ) )
            {
            // InternalDsl.g:1800:1: ( ( rule__Joint__MimicAssignment_13_1 ) )
            // InternalDsl.g:1801:2: ( rule__Joint__MimicAssignment_13_1 )
            {
             before(grammarAccess.getJointAccess().getMimicAssignment_13_1()); 
            // InternalDsl.g:1802:2: ( rule__Joint__MimicAssignment_13_1 )
            // InternalDsl.g:1802:3: rule__Joint__MimicAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__MimicAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getMimicAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_13__1__Impl"


    // $ANTLR start "rule__Joint__Group_14__0"
    // InternalDsl.g:1811:1: rule__Joint__Group_14__0 : rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1 ;
    public final void rule__Joint__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1815:1: ( rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1 )
            // InternalDsl.g:1816:2: rule__Joint__Group_14__0__Impl rule__Joint__Group_14__1
            {
            pushFollow(FOLLOW_20);
            rule__Joint__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Joint__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__0"


    // $ANTLR start "rule__Joint__Group_14__0__Impl"
    // InternalDsl.g:1823:1: rule__Joint__Group_14__0__Impl : ( 'SafetyController' ) ;
    public final void rule__Joint__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1827:1: ( ( 'SafetyController' ) )
            // InternalDsl.g:1828:1: ( 'SafetyController' )
            {
            // InternalDsl.g:1828:1: ( 'SafetyController' )
            // InternalDsl.g:1829:2: 'SafetyController'
            {
             before(grammarAccess.getJointAccess().getSafetyControllerKeyword_14_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getSafetyControllerKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__0__Impl"


    // $ANTLR start "rule__Joint__Group_14__1"
    // InternalDsl.g:1838:1: rule__Joint__Group_14__1 : rule__Joint__Group_14__1__Impl ;
    public final void rule__Joint__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1842:1: ( rule__Joint__Group_14__1__Impl )
            // InternalDsl.g:1843:2: rule__Joint__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Joint__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__1"


    // $ANTLR start "rule__Joint__Group_14__1__Impl"
    // InternalDsl.g:1849:1: rule__Joint__Group_14__1__Impl : ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) ) ;
    public final void rule__Joint__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1853:1: ( ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) ) )
            // InternalDsl.g:1854:1: ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) )
            {
            // InternalDsl.g:1854:1: ( ( rule__Joint__SafetycontrollerAssignment_14_1 ) )
            // InternalDsl.g:1855:2: ( rule__Joint__SafetycontrollerAssignment_14_1 )
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerAssignment_14_1()); 
            // InternalDsl.g:1856:2: ( rule__Joint__SafetycontrollerAssignment_14_1 )
            // InternalDsl.g:1856:3: rule__Joint__SafetycontrollerAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Joint__SafetycontrollerAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getJointAccess().getSafetycontrollerAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__Group_14__1__Impl"


    // $ANTLR start "rule__Inertial__Group__0"
    // InternalDsl.g:1865:1: rule__Inertial__Group__0 : rule__Inertial__Group__0__Impl rule__Inertial__Group__1 ;
    public final void rule__Inertial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1869:1: ( rule__Inertial__Group__0__Impl rule__Inertial__Group__1 )
            // InternalDsl.g:1870:2: rule__Inertial__Group__0__Impl rule__Inertial__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Inertial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0"


    // $ANTLR start "rule__Inertial__Group__0__Impl"
    // InternalDsl.g:1877:1: rule__Inertial__Group__0__Impl : ( 'Inertial' ) ;
    public final void rule__Inertial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1881:1: ( ( 'Inertial' ) )
            // InternalDsl.g:1882:1: ( 'Inertial' )
            {
            // InternalDsl.g:1882:1: ( 'Inertial' )
            // InternalDsl.g:1883:2: 'Inertial'
            {
             before(grammarAccess.getInertialAccess().getInertialKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getInertialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__0__Impl"


    // $ANTLR start "rule__Inertial__Group__1"
    // InternalDsl.g:1892:1: rule__Inertial__Group__1 : rule__Inertial__Group__1__Impl rule__Inertial__Group__2 ;
    public final void rule__Inertial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1896:1: ( rule__Inertial__Group__1__Impl rule__Inertial__Group__2 )
            // InternalDsl.g:1897:2: rule__Inertial__Group__1__Impl rule__Inertial__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Inertial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1"


    // $ANTLR start "rule__Inertial__Group__1__Impl"
    // InternalDsl.g:1904:1: rule__Inertial__Group__1__Impl : ( ( rule__Inertial__NameAssignment_1 )? ) ;
    public final void rule__Inertial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1908:1: ( ( ( rule__Inertial__NameAssignment_1 )? ) )
            // InternalDsl.g:1909:1: ( ( rule__Inertial__NameAssignment_1 )? )
            {
            // InternalDsl.g:1909:1: ( ( rule__Inertial__NameAssignment_1 )? )
            // InternalDsl.g:1910:2: ( rule__Inertial__NameAssignment_1 )?
            {
             before(grammarAccess.getInertialAccess().getNameAssignment_1()); 
            // InternalDsl.g:1911:2: ( rule__Inertial__NameAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1911:3: rule__Inertial__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__1__Impl"


    // $ANTLR start "rule__Inertial__Group__2"
    // InternalDsl.g:1919:1: rule__Inertial__Group__2 : rule__Inertial__Group__2__Impl rule__Inertial__Group__3 ;
    public final void rule__Inertial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1923:1: ( rule__Inertial__Group__2__Impl rule__Inertial__Group__3 )
            // InternalDsl.g:1924:2: rule__Inertial__Group__2__Impl rule__Inertial__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Inertial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2"


    // $ANTLR start "rule__Inertial__Group__2__Impl"
    // InternalDsl.g:1931:1: rule__Inertial__Group__2__Impl : ( ( rule__Inertial__InertiaAssignment_2 ) ) ;
    public final void rule__Inertial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1935:1: ( ( ( rule__Inertial__InertiaAssignment_2 ) ) )
            // InternalDsl.g:1936:1: ( ( rule__Inertial__InertiaAssignment_2 ) )
            {
            // InternalDsl.g:1936:1: ( ( rule__Inertial__InertiaAssignment_2 ) )
            // InternalDsl.g:1937:2: ( rule__Inertial__InertiaAssignment_2 )
            {
             before(grammarAccess.getInertialAccess().getInertiaAssignment_2()); 
            // InternalDsl.g:1938:2: ( rule__Inertial__InertiaAssignment_2 )
            // InternalDsl.g:1938:3: rule__Inertial__InertiaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__InertiaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getInertiaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__2__Impl"


    // $ANTLR start "rule__Inertial__Group__3"
    // InternalDsl.g:1946:1: rule__Inertial__Group__3 : rule__Inertial__Group__3__Impl rule__Inertial__Group__4 ;
    public final void rule__Inertial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1950:1: ( rule__Inertial__Group__3__Impl rule__Inertial__Group__4 )
            // InternalDsl.g:1951:2: rule__Inertial__Group__3__Impl rule__Inertial__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Inertial__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertial__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__3"


    // $ANTLR start "rule__Inertial__Group__3__Impl"
    // InternalDsl.g:1958:1: rule__Inertial__Group__3__Impl : ( ( rule__Inertial__MassAssignment_3 ) ) ;
    public final void rule__Inertial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1962:1: ( ( ( rule__Inertial__MassAssignment_3 ) ) )
            // InternalDsl.g:1963:1: ( ( rule__Inertial__MassAssignment_3 ) )
            {
            // InternalDsl.g:1963:1: ( ( rule__Inertial__MassAssignment_3 ) )
            // InternalDsl.g:1964:2: ( rule__Inertial__MassAssignment_3 )
            {
             before(grammarAccess.getInertialAccess().getMassAssignment_3()); 
            // InternalDsl.g:1965:2: ( rule__Inertial__MassAssignment_3 )
            // InternalDsl.g:1965:3: rule__Inertial__MassAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__MassAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInertialAccess().getMassAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__3__Impl"


    // $ANTLR start "rule__Inertial__Group__4"
    // InternalDsl.g:1973:1: rule__Inertial__Group__4 : rule__Inertial__Group__4__Impl ;
    public final void rule__Inertial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1977:1: ( rule__Inertial__Group__4__Impl )
            // InternalDsl.g:1978:2: rule__Inertial__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertial__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__4"


    // $ANTLR start "rule__Inertial__Group__4__Impl"
    // InternalDsl.g:1984:1: rule__Inertial__Group__4__Impl : ( ( rule__Inertial__OriginAssignment_4 )? ) ;
    public final void rule__Inertial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1988:1: ( ( ( rule__Inertial__OriginAssignment_4 )? ) )
            // InternalDsl.g:1989:1: ( ( rule__Inertial__OriginAssignment_4 )? )
            {
            // InternalDsl.g:1989:1: ( ( rule__Inertial__OriginAssignment_4 )? )
            // InternalDsl.g:1990:2: ( rule__Inertial__OriginAssignment_4 )?
            {
             before(grammarAccess.getInertialAccess().getOriginAssignment_4()); 
            // InternalDsl.g:1991:2: ( rule__Inertial__OriginAssignment_4 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1991:3: rule__Inertial__OriginAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertial__OriginAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertialAccess().getOriginAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__Group__4__Impl"


    // $ANTLR start "rule__Visual__Group__0"
    // InternalDsl.g:2000:1: rule__Visual__Group__0 : rule__Visual__Group__0__Impl rule__Visual__Group__1 ;
    public final void rule__Visual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2004:1: ( rule__Visual__Group__0__Impl rule__Visual__Group__1 )
            // InternalDsl.g:2005:2: rule__Visual__Group__0__Impl rule__Visual__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Visual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0"


    // $ANTLR start "rule__Visual__Group__0__Impl"
    // InternalDsl.g:2012:1: rule__Visual__Group__0__Impl : ( 'Visual' ) ;
    public final void rule__Visual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2016:1: ( ( 'Visual' ) )
            // InternalDsl.g:2017:1: ( 'Visual' )
            {
            // InternalDsl.g:2017:1: ( 'Visual' )
            // InternalDsl.g:2018:2: 'Visual'
            {
             before(grammarAccess.getVisualAccess().getVisualKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getVisualKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__0__Impl"


    // $ANTLR start "rule__Visual__Group__1"
    // InternalDsl.g:2027:1: rule__Visual__Group__1 : rule__Visual__Group__1__Impl rule__Visual__Group__2 ;
    public final void rule__Visual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2031:1: ( rule__Visual__Group__1__Impl rule__Visual__Group__2 )
            // InternalDsl.g:2032:2: rule__Visual__Group__1__Impl rule__Visual__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Visual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1"


    // $ANTLR start "rule__Visual__Group__1__Impl"
    // InternalDsl.g:2039:1: rule__Visual__Group__1__Impl : ( ( rule__Visual__NameAssignment_1 )? ) ;
    public final void rule__Visual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2043:1: ( ( ( rule__Visual__NameAssignment_1 )? ) )
            // InternalDsl.g:2044:1: ( ( rule__Visual__NameAssignment_1 )? )
            {
            // InternalDsl.g:2044:1: ( ( rule__Visual__NameAssignment_1 )? )
            // InternalDsl.g:2045:2: ( rule__Visual__NameAssignment_1 )?
            {
             before(grammarAccess.getVisualAccess().getNameAssignment_1()); 
            // InternalDsl.g:2046:2: ( rule__Visual__NameAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:2046:3: rule__Visual__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__1__Impl"


    // $ANTLR start "rule__Visual__Group__2"
    // InternalDsl.g:2054:1: rule__Visual__Group__2 : rule__Visual__Group__2__Impl rule__Visual__Group__3 ;
    public final void rule__Visual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2058:1: ( rule__Visual__Group__2__Impl rule__Visual__Group__3 )
            // InternalDsl.g:2059:2: rule__Visual__Group__2__Impl rule__Visual__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Visual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2"


    // $ANTLR start "rule__Visual__Group__2__Impl"
    // InternalDsl.g:2066:1: rule__Visual__Group__2__Impl : ( 'Geometry' ) ;
    public final void rule__Visual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2070:1: ( ( 'Geometry' ) )
            // InternalDsl.g:2071:1: ( 'Geometry' )
            {
            // InternalDsl.g:2071:1: ( 'Geometry' )
            // InternalDsl.g:2072:2: 'Geometry'
            {
             before(grammarAccess.getVisualAccess().getGeometryKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getGeometryKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__2__Impl"


    // $ANTLR start "rule__Visual__Group__3"
    // InternalDsl.g:2081:1: rule__Visual__Group__3 : rule__Visual__Group__3__Impl rule__Visual__Group__4 ;
    public final void rule__Visual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2085:1: ( rule__Visual__Group__3__Impl rule__Visual__Group__4 )
            // InternalDsl.g:2086:2: rule__Visual__Group__3__Impl rule__Visual__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Visual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3"


    // $ANTLR start "rule__Visual__Group__3__Impl"
    // InternalDsl.g:2093:1: rule__Visual__Group__3__Impl : ( ( rule__Visual__GeometryAssignment_3 ) ) ;
    public final void rule__Visual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2097:1: ( ( ( rule__Visual__GeometryAssignment_3 ) ) )
            // InternalDsl.g:2098:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            {
            // InternalDsl.g:2098:1: ( ( rule__Visual__GeometryAssignment_3 ) )
            // InternalDsl.g:2099:2: ( rule__Visual__GeometryAssignment_3 )
            {
             before(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 
            // InternalDsl.g:2100:2: ( rule__Visual__GeometryAssignment_3 )
            // InternalDsl.g:2100:3: rule__Visual__GeometryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Visual__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getGeometryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__3__Impl"


    // $ANTLR start "rule__Visual__Group__4"
    // InternalDsl.g:2108:1: rule__Visual__Group__4 : rule__Visual__Group__4__Impl rule__Visual__Group__5 ;
    public final void rule__Visual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2112:1: ( rule__Visual__Group__4__Impl rule__Visual__Group__5 )
            // InternalDsl.g:2113:2: rule__Visual__Group__4__Impl rule__Visual__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Visual__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__4"


    // $ANTLR start "rule__Visual__Group__4__Impl"
    // InternalDsl.g:2120:1: rule__Visual__Group__4__Impl : ( ( rule__Visual__OriginAssignment_4 )? ) ;
    public final void rule__Visual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2124:1: ( ( ( rule__Visual__OriginAssignment_4 )? ) )
            // InternalDsl.g:2125:1: ( ( rule__Visual__OriginAssignment_4 )? )
            {
            // InternalDsl.g:2125:1: ( ( rule__Visual__OriginAssignment_4 )? )
            // InternalDsl.g:2126:2: ( rule__Visual__OriginAssignment_4 )?
            {
             before(grammarAccess.getVisualAccess().getOriginAssignment_4()); 
            // InternalDsl.g:2127:2: ( rule__Visual__OriginAssignment_4 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDsl.g:2127:3: rule__Visual__OriginAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__OriginAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getOriginAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__4__Impl"


    // $ANTLR start "rule__Visual__Group__5"
    // InternalDsl.g:2135:1: rule__Visual__Group__5 : rule__Visual__Group__5__Impl ;
    public final void rule__Visual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2139:1: ( rule__Visual__Group__5__Impl )
            // InternalDsl.g:2140:2: rule__Visual__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__5"


    // $ANTLR start "rule__Visual__Group__5__Impl"
    // InternalDsl.g:2146:1: rule__Visual__Group__5__Impl : ( ( rule__Visual__Group_5__0 )? ) ;
    public final void rule__Visual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2150:1: ( ( ( rule__Visual__Group_5__0 )? ) )
            // InternalDsl.g:2151:1: ( ( rule__Visual__Group_5__0 )? )
            {
            // InternalDsl.g:2151:1: ( ( rule__Visual__Group_5__0 )? )
            // InternalDsl.g:2152:2: ( rule__Visual__Group_5__0 )?
            {
             before(grammarAccess.getVisualAccess().getGroup_5()); 
            // InternalDsl.g:2153:2: ( rule__Visual__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDsl.g:2153:3: rule__Visual__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visual__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVisualAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group__5__Impl"


    // $ANTLR start "rule__Visual__Group_5__0"
    // InternalDsl.g:2162:1: rule__Visual__Group_5__0 : rule__Visual__Group_5__0__Impl rule__Visual__Group_5__1 ;
    public final void rule__Visual__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2166:1: ( rule__Visual__Group_5__0__Impl rule__Visual__Group_5__1 )
            // InternalDsl.g:2167:2: rule__Visual__Group_5__0__Impl rule__Visual__Group_5__1
            {
            pushFollow(FOLLOW_27);
            rule__Visual__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_5__0"


    // $ANTLR start "rule__Visual__Group_5__0__Impl"
    // InternalDsl.g:2174:1: rule__Visual__Group_5__0__Impl : ( 'Material' ) ;
    public final void rule__Visual__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2178:1: ( ( 'Material' ) )
            // InternalDsl.g:2179:1: ( 'Material' )
            {
            // InternalDsl.g:2179:1: ( 'Material' )
            // InternalDsl.g:2180:2: 'Material'
            {
             before(grammarAccess.getVisualAccess().getMaterialKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getMaterialKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_5__0__Impl"


    // $ANTLR start "rule__Visual__Group_5__1"
    // InternalDsl.g:2189:1: rule__Visual__Group_5__1 : rule__Visual__Group_5__1__Impl ;
    public final void rule__Visual__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2193:1: ( rule__Visual__Group_5__1__Impl )
            // InternalDsl.g:2194:2: rule__Visual__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_5__1"


    // $ANTLR start "rule__Visual__Group_5__1__Impl"
    // InternalDsl.g:2200:1: rule__Visual__Group_5__1__Impl : ( ( rule__Visual__MaterialAssignment_5_1 ) ) ;
    public final void rule__Visual__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2204:1: ( ( ( rule__Visual__MaterialAssignment_5_1 ) ) )
            // InternalDsl.g:2205:1: ( ( rule__Visual__MaterialAssignment_5_1 ) )
            {
            // InternalDsl.g:2205:1: ( ( rule__Visual__MaterialAssignment_5_1 ) )
            // InternalDsl.g:2206:2: ( rule__Visual__MaterialAssignment_5_1 )
            {
             before(grammarAccess.getVisualAccess().getMaterialAssignment_5_1()); 
            // InternalDsl.g:2207:2: ( rule__Visual__MaterialAssignment_5_1 )
            // InternalDsl.g:2207:3: rule__Visual__MaterialAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Visual__MaterialAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVisualAccess().getMaterialAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__Group_5__1__Impl"


    // $ANTLR start "rule__Collision__Group__0"
    // InternalDsl.g:2216:1: rule__Collision__Group__0 : rule__Collision__Group__0__Impl rule__Collision__Group__1 ;
    public final void rule__Collision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2220:1: ( rule__Collision__Group__0__Impl rule__Collision__Group__1 )
            // InternalDsl.g:2221:2: rule__Collision__Group__0__Impl rule__Collision__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Collision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0"


    // $ANTLR start "rule__Collision__Group__0__Impl"
    // InternalDsl.g:2228:1: rule__Collision__Group__0__Impl : ( 'Collision' ) ;
    public final void rule__Collision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2232:1: ( ( 'Collision' ) )
            // InternalDsl.g:2233:1: ( 'Collision' )
            {
            // InternalDsl.g:2233:1: ( 'Collision' )
            // InternalDsl.g:2234:2: 'Collision'
            {
             before(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getCollisionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__0__Impl"


    // $ANTLR start "rule__Collision__Group__1"
    // InternalDsl.g:2243:1: rule__Collision__Group__1 : rule__Collision__Group__1__Impl rule__Collision__Group__2 ;
    public final void rule__Collision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2247:1: ( rule__Collision__Group__1__Impl rule__Collision__Group__2 )
            // InternalDsl.g:2248:2: rule__Collision__Group__1__Impl rule__Collision__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Collision__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1"


    // $ANTLR start "rule__Collision__Group__1__Impl"
    // InternalDsl.g:2255:1: rule__Collision__Group__1__Impl : ( ( rule__Collision__NameAssignment_1 ) ) ;
    public final void rule__Collision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2259:1: ( ( ( rule__Collision__NameAssignment_1 ) ) )
            // InternalDsl.g:2260:1: ( ( rule__Collision__NameAssignment_1 ) )
            {
            // InternalDsl.g:2260:1: ( ( rule__Collision__NameAssignment_1 ) )
            // InternalDsl.g:2261:2: ( rule__Collision__NameAssignment_1 )
            {
             before(grammarAccess.getCollisionAccess().getNameAssignment_1()); 
            // InternalDsl.g:2262:2: ( rule__Collision__NameAssignment_1 )
            // InternalDsl.g:2262:3: rule__Collision__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Collision__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__1__Impl"


    // $ANTLR start "rule__Collision__Group__2"
    // InternalDsl.g:2270:1: rule__Collision__Group__2 : rule__Collision__Group__2__Impl rule__Collision__Group__3 ;
    public final void rule__Collision__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2274:1: ( rule__Collision__Group__2__Impl rule__Collision__Group__3 )
            // InternalDsl.g:2275:2: rule__Collision__Group__2__Impl rule__Collision__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Collision__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2"


    // $ANTLR start "rule__Collision__Group__2__Impl"
    // InternalDsl.g:2282:1: rule__Collision__Group__2__Impl : ( 'Geometry' ) ;
    public final void rule__Collision__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2286:1: ( ( 'Geometry' ) )
            // InternalDsl.g:2287:1: ( 'Geometry' )
            {
            // InternalDsl.g:2287:1: ( 'Geometry' )
            // InternalDsl.g:2288:2: 'Geometry'
            {
             before(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getGeometryKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__2__Impl"


    // $ANTLR start "rule__Collision__Group__3"
    // InternalDsl.g:2297:1: rule__Collision__Group__3 : rule__Collision__Group__3__Impl rule__Collision__Group__4 ;
    public final void rule__Collision__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2301:1: ( rule__Collision__Group__3__Impl rule__Collision__Group__4 )
            // InternalDsl.g:2302:2: rule__Collision__Group__3__Impl rule__Collision__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Collision__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Collision__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__3"


    // $ANTLR start "rule__Collision__Group__3__Impl"
    // InternalDsl.g:2309:1: rule__Collision__Group__3__Impl : ( ( rule__Collision__GeometryAssignment_3 ) ) ;
    public final void rule__Collision__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2313:1: ( ( ( rule__Collision__GeometryAssignment_3 ) ) )
            // InternalDsl.g:2314:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            {
            // InternalDsl.g:2314:1: ( ( rule__Collision__GeometryAssignment_3 ) )
            // InternalDsl.g:2315:2: ( rule__Collision__GeometryAssignment_3 )
            {
             before(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 
            // InternalDsl.g:2316:2: ( rule__Collision__GeometryAssignment_3 )
            // InternalDsl.g:2316:3: rule__Collision__GeometryAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Collision__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCollisionAccess().getGeometryAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__3__Impl"


    // $ANTLR start "rule__Collision__Group__4"
    // InternalDsl.g:2324:1: rule__Collision__Group__4 : rule__Collision__Group__4__Impl ;
    public final void rule__Collision__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2328:1: ( rule__Collision__Group__4__Impl )
            // InternalDsl.g:2329:2: rule__Collision__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collision__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__4"


    // $ANTLR start "rule__Collision__Group__4__Impl"
    // InternalDsl.g:2335:1: rule__Collision__Group__4__Impl : ( ( rule__Collision__OriginAssignment_4 )? ) ;
    public final void rule__Collision__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2339:1: ( ( ( rule__Collision__OriginAssignment_4 )? ) )
            // InternalDsl.g:2340:1: ( ( rule__Collision__OriginAssignment_4 )? )
            {
            // InternalDsl.g:2340:1: ( ( rule__Collision__OriginAssignment_4 )? )
            // InternalDsl.g:2341:2: ( rule__Collision__OriginAssignment_4 )?
            {
             before(grammarAccess.getCollisionAccess().getOriginAssignment_4()); 
            // InternalDsl.g:2342:2: ( rule__Collision__OriginAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDsl.g:2342:3: rule__Collision__OriginAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Collision__OriginAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCollisionAccess().getOriginAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__Group__4__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalDsl.g:2351:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2355:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalDsl.g:2356:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0"


    // $ANTLR start "rule__Origin__Group__0__Impl"
    // InternalDsl.g:2363:1: rule__Origin__Group__0__Impl : ( 'Origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2367:1: ( ( 'Origin' ) )
            // InternalDsl.g:2368:1: ( 'Origin' )
            {
            // InternalDsl.g:2368:1: ( 'Origin' )
            // InternalDsl.g:2369:2: 'Origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getOriginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalDsl.g:2378:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2382:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalDsl.g:2383:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1"


    // $ANTLR start "rule__Origin__Group__1__Impl"
    // InternalDsl.g:2390:1: rule__Origin__Group__1__Impl : ( ( rule__Origin__NameAssignment_1 )? ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2394:1: ( ( ( rule__Origin__NameAssignment_1 )? ) )
            // InternalDsl.g:2395:1: ( ( rule__Origin__NameAssignment_1 )? )
            {
            // InternalDsl.g:2395:1: ( ( rule__Origin__NameAssignment_1 )? )
            // InternalDsl.g:2396:2: ( rule__Origin__NameAssignment_1 )?
            {
             before(grammarAccess.getOriginAccess().getNameAssignment_1()); 
            // InternalDsl.g:2397:2: ( rule__Origin__NameAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDsl.g:2397:3: rule__Origin__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__2"
    // InternalDsl.g:2405:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl rule__Origin__Group__3 ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2409:1: ( rule__Origin__Group__2__Impl rule__Origin__Group__3 )
            // InternalDsl.g:2410:2: rule__Origin__Group__2__Impl rule__Origin__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Origin__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2"


    // $ANTLR start "rule__Origin__Group__2__Impl"
    // InternalDsl.g:2417:1: rule__Origin__Group__2__Impl : ( 'xyz' ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2421:1: ( ( 'xyz' ) )
            // InternalDsl.g:2422:1: ( 'xyz' )
            {
            // InternalDsl.g:2422:1: ( 'xyz' )
            // InternalDsl.g:2423:2: 'xyz'
            {
             before(grammarAccess.getOriginAccess().getXyzKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getXyzKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2__Impl"


    // $ANTLR start "rule__Origin__Group__3"
    // InternalDsl.g:2432:1: rule__Origin__Group__3 : rule__Origin__Group__3__Impl rule__Origin__Group__4 ;
    public final void rule__Origin__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2436:1: ( rule__Origin__Group__3__Impl rule__Origin__Group__4 )
            // InternalDsl.g:2437:2: rule__Origin__Group__3__Impl rule__Origin__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Origin__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__3"


    // $ANTLR start "rule__Origin__Group__3__Impl"
    // InternalDsl.g:2444:1: rule__Origin__Group__3__Impl : ( ( rule__Origin__XAssignment_3 ) ) ;
    public final void rule__Origin__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2448:1: ( ( ( rule__Origin__XAssignment_3 ) ) )
            // InternalDsl.g:2449:1: ( ( rule__Origin__XAssignment_3 ) )
            {
            // InternalDsl.g:2449:1: ( ( rule__Origin__XAssignment_3 ) )
            // InternalDsl.g:2450:2: ( rule__Origin__XAssignment_3 )
            {
             before(grammarAccess.getOriginAccess().getXAssignment_3()); 
            // InternalDsl.g:2451:2: ( rule__Origin__XAssignment_3 )
            // InternalDsl.g:2451:3: rule__Origin__XAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Origin__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getXAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__3__Impl"


    // $ANTLR start "rule__Origin__Group__4"
    // InternalDsl.g:2459:1: rule__Origin__Group__4 : rule__Origin__Group__4__Impl rule__Origin__Group__5 ;
    public final void rule__Origin__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2463:1: ( rule__Origin__Group__4__Impl rule__Origin__Group__5 )
            // InternalDsl.g:2464:2: rule__Origin__Group__4__Impl rule__Origin__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Origin__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__4"


    // $ANTLR start "rule__Origin__Group__4__Impl"
    // InternalDsl.g:2471:1: rule__Origin__Group__4__Impl : ( ( rule__Origin__YAssignment_4 ) ) ;
    public final void rule__Origin__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2475:1: ( ( ( rule__Origin__YAssignment_4 ) ) )
            // InternalDsl.g:2476:1: ( ( rule__Origin__YAssignment_4 ) )
            {
            // InternalDsl.g:2476:1: ( ( rule__Origin__YAssignment_4 ) )
            // InternalDsl.g:2477:2: ( rule__Origin__YAssignment_4 )
            {
             before(grammarAccess.getOriginAccess().getYAssignment_4()); 
            // InternalDsl.g:2478:2: ( rule__Origin__YAssignment_4 )
            // InternalDsl.g:2478:3: rule__Origin__YAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__4__Impl"


    // $ANTLR start "rule__Origin__Group__5"
    // InternalDsl.g:2486:1: rule__Origin__Group__5 : rule__Origin__Group__5__Impl rule__Origin__Group__6 ;
    public final void rule__Origin__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2490:1: ( rule__Origin__Group__5__Impl rule__Origin__Group__6 )
            // InternalDsl.g:2491:2: rule__Origin__Group__5__Impl rule__Origin__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Origin__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__5"


    // $ANTLR start "rule__Origin__Group__5__Impl"
    // InternalDsl.g:2498:1: rule__Origin__Group__5__Impl : ( ( rule__Origin__ZAssignment_5 ) ) ;
    public final void rule__Origin__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2502:1: ( ( ( rule__Origin__ZAssignment_5 ) ) )
            // InternalDsl.g:2503:1: ( ( rule__Origin__ZAssignment_5 ) )
            {
            // InternalDsl.g:2503:1: ( ( rule__Origin__ZAssignment_5 ) )
            // InternalDsl.g:2504:2: ( rule__Origin__ZAssignment_5 )
            {
             before(grammarAccess.getOriginAccess().getZAssignment_5()); 
            // InternalDsl.g:2505:2: ( rule__Origin__ZAssignment_5 )
            // InternalDsl.g:2505:3: rule__Origin__ZAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Origin__ZAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getZAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__5__Impl"


    // $ANTLR start "rule__Origin__Group__6"
    // InternalDsl.g:2513:1: rule__Origin__Group__6 : rule__Origin__Group__6__Impl ;
    public final void rule__Origin__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2517:1: ( rule__Origin__Group__6__Impl )
            // InternalDsl.g:2518:2: rule__Origin__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__6"


    // $ANTLR start "rule__Origin__Group__6__Impl"
    // InternalDsl.g:2524:1: rule__Origin__Group__6__Impl : ( ( rule__Origin__Group_6__0 )? ) ;
    public final void rule__Origin__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2528:1: ( ( ( rule__Origin__Group_6__0 )? ) )
            // InternalDsl.g:2529:1: ( ( rule__Origin__Group_6__0 )? )
            {
            // InternalDsl.g:2529:1: ( ( rule__Origin__Group_6__0 )? )
            // InternalDsl.g:2530:2: ( rule__Origin__Group_6__0 )?
            {
             before(grammarAccess.getOriginAccess().getGroup_6()); 
            // InternalDsl.g:2531:2: ( rule__Origin__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDsl.g:2531:3: rule__Origin__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Origin__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOriginAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__6__Impl"


    // $ANTLR start "rule__Origin__Group_6__0"
    // InternalDsl.g:2540:1: rule__Origin__Group_6__0 : rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 ;
    public final void rule__Origin__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2544:1: ( rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1 )
            // InternalDsl.g:2545:2: rule__Origin__Group_6__0__Impl rule__Origin__Group_6__1
            {
            pushFollow(FOLLOW_29);
            rule__Origin__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__0"


    // $ANTLR start "rule__Origin__Group_6__0__Impl"
    // InternalDsl.g:2552:1: rule__Origin__Group_6__0__Impl : ( 'roll_pitch_yaw' ) ;
    public final void rule__Origin__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2556:1: ( ( 'roll_pitch_yaw' ) )
            // InternalDsl.g:2557:1: ( 'roll_pitch_yaw' )
            {
            // InternalDsl.g:2557:1: ( 'roll_pitch_yaw' )
            // InternalDsl.g:2558:2: 'roll_pitch_yaw'
            {
             before(grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getRoll_pitch_yawKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__0__Impl"


    // $ANTLR start "rule__Origin__Group_6__1"
    // InternalDsl.g:2567:1: rule__Origin__Group_6__1 : rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2 ;
    public final void rule__Origin__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2571:1: ( rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2 )
            // InternalDsl.g:2572:2: rule__Origin__Group_6__1__Impl rule__Origin__Group_6__2
            {
            pushFollow(FOLLOW_29);
            rule__Origin__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__1"


    // $ANTLR start "rule__Origin__Group_6__1__Impl"
    // InternalDsl.g:2579:1: rule__Origin__Group_6__1__Impl : ( ( rule__Origin__RollAssignment_6_1 ) ) ;
    public final void rule__Origin__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2583:1: ( ( ( rule__Origin__RollAssignment_6_1 ) ) )
            // InternalDsl.g:2584:1: ( ( rule__Origin__RollAssignment_6_1 ) )
            {
            // InternalDsl.g:2584:1: ( ( rule__Origin__RollAssignment_6_1 ) )
            // InternalDsl.g:2585:2: ( rule__Origin__RollAssignment_6_1 )
            {
             before(grammarAccess.getOriginAccess().getRollAssignment_6_1()); 
            // InternalDsl.g:2586:2: ( rule__Origin__RollAssignment_6_1 )
            // InternalDsl.g:2586:3: rule__Origin__RollAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Origin__RollAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getRollAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__1__Impl"


    // $ANTLR start "rule__Origin__Group_6__2"
    // InternalDsl.g:2594:1: rule__Origin__Group_6__2 : rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3 ;
    public final void rule__Origin__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2598:1: ( rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3 )
            // InternalDsl.g:2599:2: rule__Origin__Group_6__2__Impl rule__Origin__Group_6__3
            {
            pushFollow(FOLLOW_29);
            rule__Origin__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__2"


    // $ANTLR start "rule__Origin__Group_6__2__Impl"
    // InternalDsl.g:2606:1: rule__Origin__Group_6__2__Impl : ( ( rule__Origin__PitchAssignment_6_2 ) ) ;
    public final void rule__Origin__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2610:1: ( ( ( rule__Origin__PitchAssignment_6_2 ) ) )
            // InternalDsl.g:2611:1: ( ( rule__Origin__PitchAssignment_6_2 ) )
            {
            // InternalDsl.g:2611:1: ( ( rule__Origin__PitchAssignment_6_2 ) )
            // InternalDsl.g:2612:2: ( rule__Origin__PitchAssignment_6_2 )
            {
             before(grammarAccess.getOriginAccess().getPitchAssignment_6_2()); 
            // InternalDsl.g:2613:2: ( rule__Origin__PitchAssignment_6_2 )
            // InternalDsl.g:2613:3: rule__Origin__PitchAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Origin__PitchAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getPitchAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__2__Impl"


    // $ANTLR start "rule__Origin__Group_6__3"
    // InternalDsl.g:2621:1: rule__Origin__Group_6__3 : rule__Origin__Group_6__3__Impl ;
    public final void rule__Origin__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2625:1: ( rule__Origin__Group_6__3__Impl )
            // InternalDsl.g:2626:2: rule__Origin__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__3"


    // $ANTLR start "rule__Origin__Group_6__3__Impl"
    // InternalDsl.g:2632:1: rule__Origin__Group_6__3__Impl : ( ( rule__Origin__YawAssignment_6_3 ) ) ;
    public final void rule__Origin__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2636:1: ( ( ( rule__Origin__YawAssignment_6_3 ) ) )
            // InternalDsl.g:2637:1: ( ( rule__Origin__YawAssignment_6_3 ) )
            {
            // InternalDsl.g:2637:1: ( ( rule__Origin__YawAssignment_6_3 ) )
            // InternalDsl.g:2638:2: ( rule__Origin__YawAssignment_6_3 )
            {
             before(grammarAccess.getOriginAccess().getYawAssignment_6_3()); 
            // InternalDsl.g:2639:2: ( rule__Origin__YawAssignment_6_3 )
            // InternalDsl.g:2639:3: rule__Origin__YawAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Origin__YawAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getYawAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group_6__3__Impl"


    // $ANTLR start "rule__Mass__Group__0"
    // InternalDsl.g:2648:1: rule__Mass__Group__0 : rule__Mass__Group__0__Impl rule__Mass__Group__1 ;
    public final void rule__Mass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2652:1: ( rule__Mass__Group__0__Impl rule__Mass__Group__1 )
            // InternalDsl.g:2653:2: rule__Mass__Group__0__Impl rule__Mass__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Mass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0"


    // $ANTLR start "rule__Mass__Group__0__Impl"
    // InternalDsl.g:2660:1: rule__Mass__Group__0__Impl : ( 'Mass' ) ;
    public final void rule__Mass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2664:1: ( ( 'Mass' ) )
            // InternalDsl.g:2665:1: ( 'Mass' )
            {
            // InternalDsl.g:2665:1: ( 'Mass' )
            // InternalDsl.g:2666:2: 'Mass'
            {
             before(grammarAccess.getMassAccess().getMassKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__0__Impl"


    // $ANTLR start "rule__Mass__Group__1"
    // InternalDsl.g:2675:1: rule__Mass__Group__1 : rule__Mass__Group__1__Impl rule__Mass__Group__2 ;
    public final void rule__Mass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2679:1: ( rule__Mass__Group__1__Impl rule__Mass__Group__2 )
            // InternalDsl.g:2680:2: rule__Mass__Group__1__Impl rule__Mass__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Mass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1"


    // $ANTLR start "rule__Mass__Group__1__Impl"
    // InternalDsl.g:2687:1: rule__Mass__Group__1__Impl : ( ( rule__Mass__NameAssignment_1 )? ) ;
    public final void rule__Mass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2691:1: ( ( ( rule__Mass__NameAssignment_1 )? ) )
            // InternalDsl.g:2692:1: ( ( rule__Mass__NameAssignment_1 )? )
            {
            // InternalDsl.g:2692:1: ( ( rule__Mass__NameAssignment_1 )? )
            // InternalDsl.g:2693:2: ( rule__Mass__NameAssignment_1 )?
            {
             before(grammarAccess.getMassAccess().getNameAssignment_1()); 
            // InternalDsl.g:2694:2: ( rule__Mass__NameAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDsl.g:2694:3: rule__Mass__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mass__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__1__Impl"


    // $ANTLR start "rule__Mass__Group__2"
    // InternalDsl.g:2702:1: rule__Mass__Group__2 : rule__Mass__Group__2__Impl rule__Mass__Group__3 ;
    public final void rule__Mass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2706:1: ( rule__Mass__Group__2__Impl rule__Mass__Group__3 )
            // InternalDsl.g:2707:2: rule__Mass__Group__2__Impl rule__Mass__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Mass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2"


    // $ANTLR start "rule__Mass__Group__2__Impl"
    // InternalDsl.g:2714:1: rule__Mass__Group__2__Impl : ( 'massValueInKilograms' ) ;
    public final void rule__Mass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2718:1: ( ( 'massValueInKilograms' ) )
            // InternalDsl.g:2719:1: ( 'massValueInKilograms' )
            {
            // InternalDsl.g:2719:1: ( 'massValueInKilograms' )
            // InternalDsl.g:2720:2: 'massValueInKilograms'
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getMassValueInKilogramsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__2__Impl"


    // $ANTLR start "rule__Mass__Group__3"
    // InternalDsl.g:2729:1: rule__Mass__Group__3 : rule__Mass__Group__3__Impl ;
    public final void rule__Mass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2733:1: ( rule__Mass__Group__3__Impl )
            // InternalDsl.g:2734:2: rule__Mass__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mass__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__3"


    // $ANTLR start "rule__Mass__Group__3__Impl"
    // InternalDsl.g:2740:1: rule__Mass__Group__3__Impl : ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) ) ;
    public final void rule__Mass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2744:1: ( ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) ) )
            // InternalDsl.g:2745:1: ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) )
            {
            // InternalDsl.g:2745:1: ( ( rule__Mass__MassValueInKilogramsAssignment_3 ) )
            // InternalDsl.g:2746:2: ( rule__Mass__MassValueInKilogramsAssignment_3 )
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsAssignment_3()); 
            // InternalDsl.g:2747:2: ( rule__Mass__MassValueInKilogramsAssignment_3 )
            // InternalDsl.g:2747:3: rule__Mass__MassValueInKilogramsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mass__MassValueInKilogramsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMassAccess().getMassValueInKilogramsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__Group__3__Impl"


    // $ANTLR start "rule__Inertia__Group__0"
    // InternalDsl.g:2756:1: rule__Inertia__Group__0 : rule__Inertia__Group__0__Impl rule__Inertia__Group__1 ;
    public final void rule__Inertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2760:1: ( rule__Inertia__Group__0__Impl rule__Inertia__Group__1 )
            // InternalDsl.g:2761:2: rule__Inertia__Group__0__Impl rule__Inertia__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Inertia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0"


    // $ANTLR start "rule__Inertia__Group__0__Impl"
    // InternalDsl.g:2768:1: rule__Inertia__Group__0__Impl : ( 'Inertia' ) ;
    public final void rule__Inertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2772:1: ( ( 'Inertia' ) )
            // InternalDsl.g:2773:1: ( 'Inertia' )
            {
            // InternalDsl.g:2773:1: ( 'Inertia' )
            // InternalDsl.g:2774:2: 'Inertia'
            {
             before(grammarAccess.getInertiaAccess().getInertiaKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getInertiaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__0__Impl"


    // $ANTLR start "rule__Inertia__Group__1"
    // InternalDsl.g:2783:1: rule__Inertia__Group__1 : rule__Inertia__Group__1__Impl rule__Inertia__Group__2 ;
    public final void rule__Inertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2787:1: ( rule__Inertia__Group__1__Impl rule__Inertia__Group__2 )
            // InternalDsl.g:2788:2: rule__Inertia__Group__1__Impl rule__Inertia__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Inertia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1"


    // $ANTLR start "rule__Inertia__Group__1__Impl"
    // InternalDsl.g:2795:1: rule__Inertia__Group__1__Impl : ( ( rule__Inertia__NameAssignment_1 )? ) ;
    public final void rule__Inertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2799:1: ( ( ( rule__Inertia__NameAssignment_1 )? ) )
            // InternalDsl.g:2800:1: ( ( rule__Inertia__NameAssignment_1 )? )
            {
            // InternalDsl.g:2800:1: ( ( rule__Inertia__NameAssignment_1 )? )
            // InternalDsl.g:2801:2: ( rule__Inertia__NameAssignment_1 )?
            {
             before(grammarAccess.getInertiaAccess().getNameAssignment_1()); 
            // InternalDsl.g:2802:2: ( rule__Inertia__NameAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:2802:3: rule__Inertia__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inertia__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInertiaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__1__Impl"


    // $ANTLR start "rule__Inertia__Group__2"
    // InternalDsl.g:2810:1: rule__Inertia__Group__2 : rule__Inertia__Group__2__Impl rule__Inertia__Group__3 ;
    public final void rule__Inertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2814:1: ( rule__Inertia__Group__2__Impl rule__Inertia__Group__3 )
            // InternalDsl.g:2815:2: rule__Inertia__Group__2__Impl rule__Inertia__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Inertia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__2"


    // $ANTLR start "rule__Inertia__Group__2__Impl"
    // InternalDsl.g:2822:1: rule__Inertia__Group__2__Impl : ( 'ixx' ) ;
    public final void rule__Inertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2826:1: ( ( 'ixx' ) )
            // InternalDsl.g:2827:1: ( 'ixx' )
            {
            // InternalDsl.g:2827:1: ( 'ixx' )
            // InternalDsl.g:2828:2: 'ixx'
            {
             before(grammarAccess.getInertiaAccess().getIxxKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxxKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__2__Impl"


    // $ANTLR start "rule__Inertia__Group__3"
    // InternalDsl.g:2837:1: rule__Inertia__Group__3 : rule__Inertia__Group__3__Impl rule__Inertia__Group__4 ;
    public final void rule__Inertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2841:1: ( rule__Inertia__Group__3__Impl rule__Inertia__Group__4 )
            // InternalDsl.g:2842:2: rule__Inertia__Group__3__Impl rule__Inertia__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Inertia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__3"


    // $ANTLR start "rule__Inertia__Group__3__Impl"
    // InternalDsl.g:2849:1: rule__Inertia__Group__3__Impl : ( ( rule__Inertia__IxxAssignment_3 ) ) ;
    public final void rule__Inertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2853:1: ( ( ( rule__Inertia__IxxAssignment_3 ) ) )
            // InternalDsl.g:2854:1: ( ( rule__Inertia__IxxAssignment_3 ) )
            {
            // InternalDsl.g:2854:1: ( ( rule__Inertia__IxxAssignment_3 ) )
            // InternalDsl.g:2855:2: ( rule__Inertia__IxxAssignment_3 )
            {
             before(grammarAccess.getInertiaAccess().getIxxAssignment_3()); 
            // InternalDsl.g:2856:2: ( rule__Inertia__IxxAssignment_3 )
            // InternalDsl.g:2856:3: rule__Inertia__IxxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__3__Impl"


    // $ANTLR start "rule__Inertia__Group__4"
    // InternalDsl.g:2864:1: rule__Inertia__Group__4 : rule__Inertia__Group__4__Impl rule__Inertia__Group__5 ;
    public final void rule__Inertia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2868:1: ( rule__Inertia__Group__4__Impl rule__Inertia__Group__5 )
            // InternalDsl.g:2869:2: rule__Inertia__Group__4__Impl rule__Inertia__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Inertia__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__4"


    // $ANTLR start "rule__Inertia__Group__4__Impl"
    // InternalDsl.g:2876:1: rule__Inertia__Group__4__Impl : ( 'ixy' ) ;
    public final void rule__Inertia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2880:1: ( ( 'ixy' ) )
            // InternalDsl.g:2881:1: ( 'ixy' )
            {
            // InternalDsl.g:2881:1: ( 'ixy' )
            // InternalDsl.g:2882:2: 'ixy'
            {
             before(grammarAccess.getInertiaAccess().getIxyKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__4__Impl"


    // $ANTLR start "rule__Inertia__Group__5"
    // InternalDsl.g:2891:1: rule__Inertia__Group__5 : rule__Inertia__Group__5__Impl rule__Inertia__Group__6 ;
    public final void rule__Inertia__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2895:1: ( rule__Inertia__Group__5__Impl rule__Inertia__Group__6 )
            // InternalDsl.g:2896:2: rule__Inertia__Group__5__Impl rule__Inertia__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Inertia__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__5"


    // $ANTLR start "rule__Inertia__Group__5__Impl"
    // InternalDsl.g:2903:1: rule__Inertia__Group__5__Impl : ( ( rule__Inertia__IxyAssignment_5 ) ) ;
    public final void rule__Inertia__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2907:1: ( ( ( rule__Inertia__IxyAssignment_5 ) ) )
            // InternalDsl.g:2908:1: ( ( rule__Inertia__IxyAssignment_5 ) )
            {
            // InternalDsl.g:2908:1: ( ( rule__Inertia__IxyAssignment_5 ) )
            // InternalDsl.g:2909:2: ( rule__Inertia__IxyAssignment_5 )
            {
             before(grammarAccess.getInertiaAccess().getIxyAssignment_5()); 
            // InternalDsl.g:2910:2: ( rule__Inertia__IxyAssignment_5 )
            // InternalDsl.g:2910:3: rule__Inertia__IxyAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxyAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__5__Impl"


    // $ANTLR start "rule__Inertia__Group__6"
    // InternalDsl.g:2918:1: rule__Inertia__Group__6 : rule__Inertia__Group__6__Impl rule__Inertia__Group__7 ;
    public final void rule__Inertia__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2922:1: ( rule__Inertia__Group__6__Impl rule__Inertia__Group__7 )
            // InternalDsl.g:2923:2: rule__Inertia__Group__6__Impl rule__Inertia__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Inertia__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__6"


    // $ANTLR start "rule__Inertia__Group__6__Impl"
    // InternalDsl.g:2930:1: rule__Inertia__Group__6__Impl : ( 'ixz' ) ;
    public final void rule__Inertia__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2934:1: ( ( 'ixz' ) )
            // InternalDsl.g:2935:1: ( 'ixz' )
            {
            // InternalDsl.g:2935:1: ( 'ixz' )
            // InternalDsl.g:2936:2: 'ixz'
            {
             before(grammarAccess.getInertiaAccess().getIxzKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIxzKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__6__Impl"


    // $ANTLR start "rule__Inertia__Group__7"
    // InternalDsl.g:2945:1: rule__Inertia__Group__7 : rule__Inertia__Group__7__Impl rule__Inertia__Group__8 ;
    public final void rule__Inertia__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2949:1: ( rule__Inertia__Group__7__Impl rule__Inertia__Group__8 )
            // InternalDsl.g:2950:2: rule__Inertia__Group__7__Impl rule__Inertia__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Inertia__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__7"


    // $ANTLR start "rule__Inertia__Group__7__Impl"
    // InternalDsl.g:2957:1: rule__Inertia__Group__7__Impl : ( ( rule__Inertia__IxzAssignment_7 ) ) ;
    public final void rule__Inertia__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2961:1: ( ( ( rule__Inertia__IxzAssignment_7 ) ) )
            // InternalDsl.g:2962:1: ( ( rule__Inertia__IxzAssignment_7 ) )
            {
            // InternalDsl.g:2962:1: ( ( rule__Inertia__IxzAssignment_7 ) )
            // InternalDsl.g:2963:2: ( rule__Inertia__IxzAssignment_7 )
            {
             before(grammarAccess.getInertiaAccess().getIxzAssignment_7()); 
            // InternalDsl.g:2964:2: ( rule__Inertia__IxzAssignment_7 )
            // InternalDsl.g:2964:3: rule__Inertia__IxzAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IxzAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIxzAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__7__Impl"


    // $ANTLR start "rule__Inertia__Group__8"
    // InternalDsl.g:2972:1: rule__Inertia__Group__8 : rule__Inertia__Group__8__Impl rule__Inertia__Group__9 ;
    public final void rule__Inertia__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2976:1: ( rule__Inertia__Group__8__Impl rule__Inertia__Group__9 )
            // InternalDsl.g:2977:2: rule__Inertia__Group__8__Impl rule__Inertia__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__Inertia__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__8"


    // $ANTLR start "rule__Inertia__Group__8__Impl"
    // InternalDsl.g:2984:1: rule__Inertia__Group__8__Impl : ( 'iyy' ) ;
    public final void rule__Inertia__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2988:1: ( ( 'iyy' ) )
            // InternalDsl.g:2989:1: ( 'iyy' )
            {
            // InternalDsl.g:2989:1: ( 'iyy' )
            // InternalDsl.g:2990:2: 'iyy'
            {
             before(grammarAccess.getInertiaAccess().getIyyKeyword_8()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyyKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__8__Impl"


    // $ANTLR start "rule__Inertia__Group__9"
    // InternalDsl.g:2999:1: rule__Inertia__Group__9 : rule__Inertia__Group__9__Impl rule__Inertia__Group__10 ;
    public final void rule__Inertia__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3003:1: ( rule__Inertia__Group__9__Impl rule__Inertia__Group__10 )
            // InternalDsl.g:3004:2: rule__Inertia__Group__9__Impl rule__Inertia__Group__10
            {
            pushFollow(FOLLOW_37);
            rule__Inertia__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__9"


    // $ANTLR start "rule__Inertia__Group__9__Impl"
    // InternalDsl.g:3011:1: rule__Inertia__Group__9__Impl : ( ( rule__Inertia__IyyAssignment_9 ) ) ;
    public final void rule__Inertia__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3015:1: ( ( ( rule__Inertia__IyyAssignment_9 ) ) )
            // InternalDsl.g:3016:1: ( ( rule__Inertia__IyyAssignment_9 ) )
            {
            // InternalDsl.g:3016:1: ( ( rule__Inertia__IyyAssignment_9 ) )
            // InternalDsl.g:3017:2: ( rule__Inertia__IyyAssignment_9 )
            {
             before(grammarAccess.getInertiaAccess().getIyyAssignment_9()); 
            // InternalDsl.g:3018:2: ( rule__Inertia__IyyAssignment_9 )
            // InternalDsl.g:3018:3: rule__Inertia__IyyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyyAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__9__Impl"


    // $ANTLR start "rule__Inertia__Group__10"
    // InternalDsl.g:3026:1: rule__Inertia__Group__10 : rule__Inertia__Group__10__Impl rule__Inertia__Group__11 ;
    public final void rule__Inertia__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3030:1: ( rule__Inertia__Group__10__Impl rule__Inertia__Group__11 )
            // InternalDsl.g:3031:2: rule__Inertia__Group__10__Impl rule__Inertia__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__Inertia__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__10"


    // $ANTLR start "rule__Inertia__Group__10__Impl"
    // InternalDsl.g:3038:1: rule__Inertia__Group__10__Impl : ( 'iyz' ) ;
    public final void rule__Inertia__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3042:1: ( ( 'iyz' ) )
            // InternalDsl.g:3043:1: ( 'iyz' )
            {
            // InternalDsl.g:3043:1: ( 'iyz' )
            // InternalDsl.g:3044:2: 'iyz'
            {
             before(grammarAccess.getInertiaAccess().getIyzKeyword_10()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIyzKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__10__Impl"


    // $ANTLR start "rule__Inertia__Group__11"
    // InternalDsl.g:3053:1: rule__Inertia__Group__11 : rule__Inertia__Group__11__Impl rule__Inertia__Group__12 ;
    public final void rule__Inertia__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3057:1: ( rule__Inertia__Group__11__Impl rule__Inertia__Group__12 )
            // InternalDsl.g:3058:2: rule__Inertia__Group__11__Impl rule__Inertia__Group__12
            {
            pushFollow(FOLLOW_38);
            rule__Inertia__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__11"


    // $ANTLR start "rule__Inertia__Group__11__Impl"
    // InternalDsl.g:3065:1: rule__Inertia__Group__11__Impl : ( ( rule__Inertia__IyzAssignment_11 ) ) ;
    public final void rule__Inertia__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3069:1: ( ( ( rule__Inertia__IyzAssignment_11 ) ) )
            // InternalDsl.g:3070:1: ( ( rule__Inertia__IyzAssignment_11 ) )
            {
            // InternalDsl.g:3070:1: ( ( rule__Inertia__IyzAssignment_11 ) )
            // InternalDsl.g:3071:2: ( rule__Inertia__IyzAssignment_11 )
            {
             before(grammarAccess.getInertiaAccess().getIyzAssignment_11()); 
            // InternalDsl.g:3072:2: ( rule__Inertia__IyzAssignment_11 )
            // InternalDsl.g:3072:3: rule__Inertia__IyzAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IyzAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIyzAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__11__Impl"


    // $ANTLR start "rule__Inertia__Group__12"
    // InternalDsl.g:3080:1: rule__Inertia__Group__12 : rule__Inertia__Group__12__Impl rule__Inertia__Group__13 ;
    public final void rule__Inertia__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3084:1: ( rule__Inertia__Group__12__Impl rule__Inertia__Group__13 )
            // InternalDsl.g:3085:2: rule__Inertia__Group__12__Impl rule__Inertia__Group__13
            {
            pushFollow(FOLLOW_29);
            rule__Inertia__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inertia__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__12"


    // $ANTLR start "rule__Inertia__Group__12__Impl"
    // InternalDsl.g:3092:1: rule__Inertia__Group__12__Impl : ( 'izz' ) ;
    public final void rule__Inertia__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3096:1: ( ( 'izz' ) )
            // InternalDsl.g:3097:1: ( 'izz' )
            {
            // InternalDsl.g:3097:1: ( 'izz' )
            // InternalDsl.g:3098:2: 'izz'
            {
             before(grammarAccess.getInertiaAccess().getIzzKeyword_12()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getIzzKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__12__Impl"


    // $ANTLR start "rule__Inertia__Group__13"
    // InternalDsl.g:3107:1: rule__Inertia__Group__13 : rule__Inertia__Group__13__Impl ;
    public final void rule__Inertia__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3111:1: ( rule__Inertia__Group__13__Impl )
            // InternalDsl.g:3112:2: rule__Inertia__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__13"


    // $ANTLR start "rule__Inertia__Group__13__Impl"
    // InternalDsl.g:3118:1: rule__Inertia__Group__13__Impl : ( ( rule__Inertia__IzzAssignment_13 ) ) ;
    public final void rule__Inertia__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3122:1: ( ( ( rule__Inertia__IzzAssignment_13 ) ) )
            // InternalDsl.g:3123:1: ( ( rule__Inertia__IzzAssignment_13 ) )
            {
            // InternalDsl.g:3123:1: ( ( rule__Inertia__IzzAssignment_13 ) )
            // InternalDsl.g:3124:2: ( rule__Inertia__IzzAssignment_13 )
            {
             before(grammarAccess.getInertiaAccess().getIzzAssignment_13()); 
            // InternalDsl.g:3125:2: ( rule__Inertia__IzzAssignment_13 )
            // InternalDsl.g:3125:3: rule__Inertia__IzzAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Inertia__IzzAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getInertiaAccess().getIzzAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__Group__13__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalDsl.g:3134:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3138:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalDsl.g:3139:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalDsl.g:3146:1: rule__Color__Group__0__Impl : ( 'Color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3150:1: ( ( 'Color' ) )
            // InternalDsl.g:3151:1: ( 'Color' )
            {
            // InternalDsl.g:3151:1: ( 'Color' )
            // InternalDsl.g:3152:2: 'Color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalDsl.g:3161:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3165:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalDsl.g:3166:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalDsl.g:3173:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 )? ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3177:1: ( ( ( rule__Color__NameAssignment_1 )? ) )
            // InternalDsl.g:3178:1: ( ( rule__Color__NameAssignment_1 )? )
            {
            // InternalDsl.g:3178:1: ( ( rule__Color__NameAssignment_1 )? )
            // InternalDsl.g:3179:2: ( rule__Color__NameAssignment_1 )?
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalDsl.g:3180:2: ( rule__Color__NameAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:3180:3: rule__Color__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Color__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalDsl.g:3188:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3192:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalDsl.g:3193:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalDsl.g:3200:1: rule__Color__Group__2__Impl : ( 'red_green_blue_alpha' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3204:1: ( ( 'red_green_blue_alpha' ) )
            // InternalDsl.g:3205:1: ( 'red_green_blue_alpha' )
            {
            // InternalDsl.g:3205:1: ( 'red_green_blue_alpha' )
            // InternalDsl.g:3206:2: 'red_green_blue_alpha'
            {
             before(grammarAccess.getColorAccess().getRed_green_blue_alphaKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRed_green_blue_alphaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalDsl.g:3215:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3219:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalDsl.g:3220:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Color__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalDsl.g:3227:1: rule__Color__Group__3__Impl : ( ( rule__Color__RedAssignment_3 ) ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3231:1: ( ( ( rule__Color__RedAssignment_3 ) ) )
            // InternalDsl.g:3232:1: ( ( rule__Color__RedAssignment_3 ) )
            {
            // InternalDsl.g:3232:1: ( ( rule__Color__RedAssignment_3 ) )
            // InternalDsl.g:3233:2: ( rule__Color__RedAssignment_3 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_3()); 
            // InternalDsl.g:3234:2: ( rule__Color__RedAssignment_3 )
            // InternalDsl.g:3234:3: rule__Color__RedAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Color__RedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__4"
    // InternalDsl.g:3242:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3246:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalDsl.g:3247:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Color__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__4"


    // $ANTLR start "rule__Color__Group__4__Impl"
    // InternalDsl.g:3254:1: rule__Color__Group__4__Impl : ( ( rule__Color__GreenAssignment_4 ) ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3258:1: ( ( ( rule__Color__GreenAssignment_4 ) ) )
            // InternalDsl.g:3259:1: ( ( rule__Color__GreenAssignment_4 ) )
            {
            // InternalDsl.g:3259:1: ( ( rule__Color__GreenAssignment_4 ) )
            // InternalDsl.g:3260:2: ( rule__Color__GreenAssignment_4 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_4()); 
            // InternalDsl.g:3261:2: ( rule__Color__GreenAssignment_4 )
            // InternalDsl.g:3261:3: rule__Color__GreenAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Color__GreenAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__4__Impl"


    // $ANTLR start "rule__Color__Group__5"
    // InternalDsl.g:3269:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3273:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalDsl.g:3274:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Color__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__5"


    // $ANTLR start "rule__Color__Group__5__Impl"
    // InternalDsl.g:3281:1: rule__Color__Group__5__Impl : ( ( rule__Color__BlueAssignment_5 ) ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3285:1: ( ( ( rule__Color__BlueAssignment_5 ) ) )
            // InternalDsl.g:3286:1: ( ( rule__Color__BlueAssignment_5 ) )
            {
            // InternalDsl.g:3286:1: ( ( rule__Color__BlueAssignment_5 ) )
            // InternalDsl.g:3287:2: ( rule__Color__BlueAssignment_5 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_5()); 
            // InternalDsl.g:3288:2: ( rule__Color__BlueAssignment_5 )
            // InternalDsl.g:3288:3: rule__Color__BlueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Color__BlueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__6"
    // InternalDsl.g:3296:1: rule__Color__Group__6 : rule__Color__Group__6__Impl ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3300:1: ( rule__Color__Group__6__Impl )
            // InternalDsl.g:3301:2: rule__Color__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__6"


    // $ANTLR start "rule__Color__Group__6__Impl"
    // InternalDsl.g:3307:1: rule__Color__Group__6__Impl : ( ( rule__Color__AlphaAssignment_6 ) ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3311:1: ( ( ( rule__Color__AlphaAssignment_6 ) ) )
            // InternalDsl.g:3312:1: ( ( rule__Color__AlphaAssignment_6 ) )
            {
            // InternalDsl.g:3312:1: ( ( rule__Color__AlphaAssignment_6 ) )
            // InternalDsl.g:3313:2: ( rule__Color__AlphaAssignment_6 )
            {
             before(grammarAccess.getColorAccess().getAlphaAssignment_6()); 
            // InternalDsl.g:3314:2: ( rule__Color__AlphaAssignment_6 )
            // InternalDsl.g:3314:3: rule__Color__AlphaAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Color__AlphaAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getAlphaAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__6__Impl"


    // $ANTLR start "rule__Texture__Group__0"
    // InternalDsl.g:3323:1: rule__Texture__Group__0 : rule__Texture__Group__0__Impl rule__Texture__Group__1 ;
    public final void rule__Texture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3327:1: ( rule__Texture__Group__0__Impl rule__Texture__Group__1 )
            // InternalDsl.g:3328:2: rule__Texture__Group__0__Impl rule__Texture__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Texture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0"


    // $ANTLR start "rule__Texture__Group__0__Impl"
    // InternalDsl.g:3335:1: rule__Texture__Group__0__Impl : ( 'Texture' ) ;
    public final void rule__Texture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3339:1: ( ( 'Texture' ) )
            // InternalDsl.g:3340:1: ( 'Texture' )
            {
            // InternalDsl.g:3340:1: ( 'Texture' )
            // InternalDsl.g:3341:2: 'Texture'
            {
             before(grammarAccess.getTextureAccess().getTextureKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getTextureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__0__Impl"


    // $ANTLR start "rule__Texture__Group__1"
    // InternalDsl.g:3350:1: rule__Texture__Group__1 : rule__Texture__Group__1__Impl rule__Texture__Group__2 ;
    public final void rule__Texture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3354:1: ( rule__Texture__Group__1__Impl rule__Texture__Group__2 )
            // InternalDsl.g:3355:2: rule__Texture__Group__1__Impl rule__Texture__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Texture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1"


    // $ANTLR start "rule__Texture__Group__1__Impl"
    // InternalDsl.g:3362:1: rule__Texture__Group__1__Impl : ( ( rule__Texture__NameAssignment_1 )? ) ;
    public final void rule__Texture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3366:1: ( ( ( rule__Texture__NameAssignment_1 )? ) )
            // InternalDsl.g:3367:1: ( ( rule__Texture__NameAssignment_1 )? )
            {
            // InternalDsl.g:3367:1: ( ( rule__Texture__NameAssignment_1 )? )
            // InternalDsl.g:3368:2: ( rule__Texture__NameAssignment_1 )?
            {
             before(grammarAccess.getTextureAccess().getNameAssignment_1()); 
            // InternalDsl.g:3369:2: ( rule__Texture__NameAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDsl.g:3369:3: rule__Texture__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Texture__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__1__Impl"


    // $ANTLR start "rule__Texture__Group__2"
    // InternalDsl.g:3377:1: rule__Texture__Group__2 : rule__Texture__Group__2__Impl rule__Texture__Group__3 ;
    public final void rule__Texture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3381:1: ( rule__Texture__Group__2__Impl rule__Texture__Group__3 )
            // InternalDsl.g:3382:2: rule__Texture__Group__2__Impl rule__Texture__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Texture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Texture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__2"


    // $ANTLR start "rule__Texture__Group__2__Impl"
    // InternalDsl.g:3389:1: rule__Texture__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Texture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3393:1: ( ( 'pathToFile' ) )
            // InternalDsl.g:3394:1: ( 'pathToFile' )
            {
            // InternalDsl.g:3394:1: ( 'pathToFile' )
            // InternalDsl.g:3395:2: 'pathToFile'
            {
             before(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getPathToFileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__2__Impl"


    // $ANTLR start "rule__Texture__Group__3"
    // InternalDsl.g:3404:1: rule__Texture__Group__3 : rule__Texture__Group__3__Impl ;
    public final void rule__Texture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3408:1: ( rule__Texture__Group__3__Impl )
            // InternalDsl.g:3409:2: rule__Texture__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Texture__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__3"


    // $ANTLR start "rule__Texture__Group__3__Impl"
    // InternalDsl.g:3415:1: rule__Texture__Group__3__Impl : ( ( rule__Texture__PathToFileAssignment_3 ) ) ;
    public final void rule__Texture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3419:1: ( ( ( rule__Texture__PathToFileAssignment_3 ) ) )
            // InternalDsl.g:3420:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            {
            // InternalDsl.g:3420:1: ( ( rule__Texture__PathToFileAssignment_3 ) )
            // InternalDsl.g:3421:2: ( rule__Texture__PathToFileAssignment_3 )
            {
             before(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 
            // InternalDsl.g:3422:2: ( rule__Texture__PathToFileAssignment_3 )
            // InternalDsl.g:3422:3: rule__Texture__PathToFileAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Texture__PathToFileAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextureAccess().getPathToFileAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__0"
    // InternalDsl.g:3431:1: rule__Box__Group__0 : rule__Box__Group__0__Impl rule__Box__Group__1 ;
    public final void rule__Box__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3435:1: ( rule__Box__Group__0__Impl rule__Box__Group__1 )
            // InternalDsl.g:3436:2: rule__Box__Group__0__Impl rule__Box__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Box__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0"


    // $ANTLR start "rule__Box__Group__0__Impl"
    // InternalDsl.g:3443:1: rule__Box__Group__0__Impl : ( 'Box' ) ;
    public final void rule__Box__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3447:1: ( ( 'Box' ) )
            // InternalDsl.g:3448:1: ( 'Box' )
            {
            // InternalDsl.g:3448:1: ( 'Box' )
            // InternalDsl.g:3449:2: 'Box'
            {
             before(grammarAccess.getBoxAccess().getBoxKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__0__Impl"


    // $ANTLR start "rule__Box__Group__1"
    // InternalDsl.g:3458:1: rule__Box__Group__1 : rule__Box__Group__1__Impl rule__Box__Group__2 ;
    public final void rule__Box__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3462:1: ( rule__Box__Group__1__Impl rule__Box__Group__2 )
            // InternalDsl.g:3463:2: rule__Box__Group__1__Impl rule__Box__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__Box__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1"


    // $ANTLR start "rule__Box__Group__1__Impl"
    // InternalDsl.g:3470:1: rule__Box__Group__1__Impl : ( ( rule__Box__NameAssignment_1 )? ) ;
    public final void rule__Box__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3474:1: ( ( ( rule__Box__NameAssignment_1 )? ) )
            // InternalDsl.g:3475:1: ( ( rule__Box__NameAssignment_1 )? )
            {
            // InternalDsl.g:3475:1: ( ( rule__Box__NameAssignment_1 )? )
            // InternalDsl.g:3476:2: ( rule__Box__NameAssignment_1 )?
            {
             before(grammarAccess.getBoxAccess().getNameAssignment_1()); 
            // InternalDsl.g:3477:2: ( rule__Box__NameAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDsl.g:3477:3: rule__Box__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Box__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoxAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__1__Impl"


    // $ANTLR start "rule__Box__Group__2"
    // InternalDsl.g:3485:1: rule__Box__Group__2 : rule__Box__Group__2__Impl rule__Box__Group__3 ;
    public final void rule__Box__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3489:1: ( rule__Box__Group__2__Impl rule__Box__Group__3 )
            // InternalDsl.g:3490:2: rule__Box__Group__2__Impl rule__Box__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Box__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2"


    // $ANTLR start "rule__Box__Group__2__Impl"
    // InternalDsl.g:3497:1: rule__Box__Group__2__Impl : ( 'height_length_width' ) ;
    public final void rule__Box__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3501:1: ( ( 'height_length_width' ) )
            // InternalDsl.g:3502:1: ( 'height_length_width' )
            {
            // InternalDsl.g:3502:1: ( 'height_length_width' )
            // InternalDsl.g:3503:2: 'height_length_width'
            {
             before(grammarAccess.getBoxAccess().getHeight_length_widthKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getHeight_length_widthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__2__Impl"


    // $ANTLR start "rule__Box__Group__3"
    // InternalDsl.g:3512:1: rule__Box__Group__3 : rule__Box__Group__3__Impl rule__Box__Group__4 ;
    public final void rule__Box__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3516:1: ( rule__Box__Group__3__Impl rule__Box__Group__4 )
            // InternalDsl.g:3517:2: rule__Box__Group__3__Impl rule__Box__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Box__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3"


    // $ANTLR start "rule__Box__Group__3__Impl"
    // InternalDsl.g:3524:1: rule__Box__Group__3__Impl : ( ( rule__Box__HeightAssignment_3 ) ) ;
    public final void rule__Box__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3528:1: ( ( ( rule__Box__HeightAssignment_3 ) ) )
            // InternalDsl.g:3529:1: ( ( rule__Box__HeightAssignment_3 ) )
            {
            // InternalDsl.g:3529:1: ( ( rule__Box__HeightAssignment_3 ) )
            // InternalDsl.g:3530:2: ( rule__Box__HeightAssignment_3 )
            {
             before(grammarAccess.getBoxAccess().getHeightAssignment_3()); 
            // InternalDsl.g:3531:2: ( rule__Box__HeightAssignment_3 )
            // InternalDsl.g:3531:3: rule__Box__HeightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Box__HeightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getHeightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__3__Impl"


    // $ANTLR start "rule__Box__Group__4"
    // InternalDsl.g:3539:1: rule__Box__Group__4 : rule__Box__Group__4__Impl rule__Box__Group__5 ;
    public final void rule__Box__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3543:1: ( rule__Box__Group__4__Impl rule__Box__Group__5 )
            // InternalDsl.g:3544:2: rule__Box__Group__4__Impl rule__Box__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Box__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Box__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4"


    // $ANTLR start "rule__Box__Group__4__Impl"
    // InternalDsl.g:3551:1: rule__Box__Group__4__Impl : ( ( rule__Box__LengthAssignment_4 ) ) ;
    public final void rule__Box__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3555:1: ( ( ( rule__Box__LengthAssignment_4 ) ) )
            // InternalDsl.g:3556:1: ( ( rule__Box__LengthAssignment_4 ) )
            {
            // InternalDsl.g:3556:1: ( ( rule__Box__LengthAssignment_4 ) )
            // InternalDsl.g:3557:2: ( rule__Box__LengthAssignment_4 )
            {
             before(grammarAccess.getBoxAccess().getLengthAssignment_4()); 
            // InternalDsl.g:3558:2: ( rule__Box__LengthAssignment_4 )
            // InternalDsl.g:3558:3: rule__Box__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Box__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__4__Impl"


    // $ANTLR start "rule__Box__Group__5"
    // InternalDsl.g:3566:1: rule__Box__Group__5 : rule__Box__Group__5__Impl ;
    public final void rule__Box__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3570:1: ( rule__Box__Group__5__Impl )
            // InternalDsl.g:3571:2: rule__Box__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Box__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5"


    // $ANTLR start "rule__Box__Group__5__Impl"
    // InternalDsl.g:3577:1: rule__Box__Group__5__Impl : ( ( rule__Box__WidthAssignment_5 ) ) ;
    public final void rule__Box__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3581:1: ( ( ( rule__Box__WidthAssignment_5 ) ) )
            // InternalDsl.g:3582:1: ( ( rule__Box__WidthAssignment_5 ) )
            {
            // InternalDsl.g:3582:1: ( ( rule__Box__WidthAssignment_5 ) )
            // InternalDsl.g:3583:2: ( rule__Box__WidthAssignment_5 )
            {
             before(grammarAccess.getBoxAccess().getWidthAssignment_5()); 
            // InternalDsl.g:3584:2: ( rule__Box__WidthAssignment_5 )
            // InternalDsl.g:3584:3: rule__Box__WidthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Box__WidthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBoxAccess().getWidthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__Group__5__Impl"


    // $ANTLR start "rule__Cylinder__Group__0"
    // InternalDsl.g:3593:1: rule__Cylinder__Group__0 : rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 ;
    public final void rule__Cylinder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3597:1: ( rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1 )
            // InternalDsl.g:3598:2: rule__Cylinder__Group__0__Impl rule__Cylinder__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Cylinder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0"


    // $ANTLR start "rule__Cylinder__Group__0__Impl"
    // InternalDsl.g:3605:1: rule__Cylinder__Group__0__Impl : ( 'Cylinder' ) ;
    public final void rule__Cylinder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3609:1: ( ( 'Cylinder' ) )
            // InternalDsl.g:3610:1: ( 'Cylinder' )
            {
            // InternalDsl.g:3610:1: ( 'Cylinder' )
            // InternalDsl.g:3611:2: 'Cylinder'
            {
             before(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getCylinderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__0__Impl"


    // $ANTLR start "rule__Cylinder__Group__1"
    // InternalDsl.g:3620:1: rule__Cylinder__Group__1 : rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 ;
    public final void rule__Cylinder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3624:1: ( rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2 )
            // InternalDsl.g:3625:2: rule__Cylinder__Group__1__Impl rule__Cylinder__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Cylinder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1"


    // $ANTLR start "rule__Cylinder__Group__1__Impl"
    // InternalDsl.g:3632:1: rule__Cylinder__Group__1__Impl : ( ( rule__Cylinder__NameAssignment_1 )? ) ;
    public final void rule__Cylinder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3636:1: ( ( ( rule__Cylinder__NameAssignment_1 )? ) )
            // InternalDsl.g:3637:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            {
            // InternalDsl.g:3637:1: ( ( rule__Cylinder__NameAssignment_1 )? )
            // InternalDsl.g:3638:2: ( rule__Cylinder__NameAssignment_1 )?
            {
             before(grammarAccess.getCylinderAccess().getNameAssignment_1()); 
            // InternalDsl.g:3639:2: ( rule__Cylinder__NameAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDsl.g:3639:3: rule__Cylinder__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cylinder__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCylinderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__1__Impl"


    // $ANTLR start "rule__Cylinder__Group__2"
    // InternalDsl.g:3647:1: rule__Cylinder__Group__2 : rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 ;
    public final void rule__Cylinder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3651:1: ( rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3 )
            // InternalDsl.g:3652:2: rule__Cylinder__Group__2__Impl rule__Cylinder__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Cylinder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2"


    // $ANTLR start "rule__Cylinder__Group__2__Impl"
    // InternalDsl.g:3659:1: rule__Cylinder__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Cylinder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3663:1: ( ( 'radius' ) )
            // InternalDsl.g:3664:1: ( 'radius' )
            {
            // InternalDsl.g:3664:1: ( 'radius' )
            // InternalDsl.g:3665:2: 'radius'
            {
             before(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getRadiusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__2__Impl"


    // $ANTLR start "rule__Cylinder__Group__3"
    // InternalDsl.g:3674:1: rule__Cylinder__Group__3 : rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 ;
    public final void rule__Cylinder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3678:1: ( rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4 )
            // InternalDsl.g:3679:2: rule__Cylinder__Group__3__Impl rule__Cylinder__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__Cylinder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3"


    // $ANTLR start "rule__Cylinder__Group__3__Impl"
    // InternalDsl.g:3686:1: rule__Cylinder__Group__3__Impl : ( ( rule__Cylinder__RadiusAssignment_3 ) ) ;
    public final void rule__Cylinder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3690:1: ( ( ( rule__Cylinder__RadiusAssignment_3 ) ) )
            // InternalDsl.g:3691:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            {
            // InternalDsl.g:3691:1: ( ( rule__Cylinder__RadiusAssignment_3 ) )
            // InternalDsl.g:3692:2: ( rule__Cylinder__RadiusAssignment_3 )
            {
             before(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 
            // InternalDsl.g:3693:2: ( rule__Cylinder__RadiusAssignment_3 )
            // InternalDsl.g:3693:3: rule__Cylinder__RadiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__RadiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getRadiusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__3__Impl"


    // $ANTLR start "rule__Cylinder__Group__4"
    // InternalDsl.g:3701:1: rule__Cylinder__Group__4 : rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 ;
    public final void rule__Cylinder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3705:1: ( rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5 )
            // InternalDsl.g:3706:2: rule__Cylinder__Group__4__Impl rule__Cylinder__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Cylinder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4"


    // $ANTLR start "rule__Cylinder__Group__4__Impl"
    // InternalDsl.g:3713:1: rule__Cylinder__Group__4__Impl : ( 'length' ) ;
    public final void rule__Cylinder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3717:1: ( ( 'length' ) )
            // InternalDsl.g:3718:1: ( 'length' )
            {
            // InternalDsl.g:3718:1: ( 'length' )
            // InternalDsl.g:3719:2: 'length'
            {
             before(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getLengthKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__4__Impl"


    // $ANTLR start "rule__Cylinder__Group__5"
    // InternalDsl.g:3728:1: rule__Cylinder__Group__5 : rule__Cylinder__Group__5__Impl ;
    public final void rule__Cylinder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3732:1: ( rule__Cylinder__Group__5__Impl )
            // InternalDsl.g:3733:2: rule__Cylinder__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5"


    // $ANTLR start "rule__Cylinder__Group__5__Impl"
    // InternalDsl.g:3739:1: rule__Cylinder__Group__5__Impl : ( ( rule__Cylinder__LengthAssignment_5 ) ) ;
    public final void rule__Cylinder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3743:1: ( ( ( rule__Cylinder__LengthAssignment_5 ) ) )
            // InternalDsl.g:3744:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            {
            // InternalDsl.g:3744:1: ( ( rule__Cylinder__LengthAssignment_5 ) )
            // InternalDsl.g:3745:2: ( rule__Cylinder__LengthAssignment_5 )
            {
             before(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 
            // InternalDsl.g:3746:2: ( rule__Cylinder__LengthAssignment_5 )
            // InternalDsl.g:3746:3: rule__Cylinder__LengthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Cylinder__LengthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCylinderAccess().getLengthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__Group__5__Impl"


    // $ANTLR start "rule__Mesh__Group__0"
    // InternalDsl.g:3755:1: rule__Mesh__Group__0 : rule__Mesh__Group__0__Impl rule__Mesh__Group__1 ;
    public final void rule__Mesh__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3759:1: ( rule__Mesh__Group__0__Impl rule__Mesh__Group__1 )
            // InternalDsl.g:3760:2: rule__Mesh__Group__0__Impl rule__Mesh__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Mesh__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0"


    // $ANTLR start "rule__Mesh__Group__0__Impl"
    // InternalDsl.g:3767:1: rule__Mesh__Group__0__Impl : ( 'Mesh' ) ;
    public final void rule__Mesh__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3771:1: ( ( 'Mesh' ) )
            // InternalDsl.g:3772:1: ( 'Mesh' )
            {
            // InternalDsl.g:3772:1: ( 'Mesh' )
            // InternalDsl.g:3773:2: 'Mesh'
            {
             before(grammarAccess.getMeshAccess().getMeshKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getMeshKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__0__Impl"


    // $ANTLR start "rule__Mesh__Group__1"
    // InternalDsl.g:3782:1: rule__Mesh__Group__1 : rule__Mesh__Group__1__Impl rule__Mesh__Group__2 ;
    public final void rule__Mesh__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3786:1: ( rule__Mesh__Group__1__Impl rule__Mesh__Group__2 )
            // InternalDsl.g:3787:2: rule__Mesh__Group__1__Impl rule__Mesh__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Mesh__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1"


    // $ANTLR start "rule__Mesh__Group__1__Impl"
    // InternalDsl.g:3794:1: rule__Mesh__Group__1__Impl : ( ( rule__Mesh__NameAssignment_1 )? ) ;
    public final void rule__Mesh__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3798:1: ( ( ( rule__Mesh__NameAssignment_1 )? ) )
            // InternalDsl.g:3799:1: ( ( rule__Mesh__NameAssignment_1 )? )
            {
            // InternalDsl.g:3799:1: ( ( rule__Mesh__NameAssignment_1 )? )
            // InternalDsl.g:3800:2: ( rule__Mesh__NameAssignment_1 )?
            {
             before(grammarAccess.getMeshAccess().getNameAssignment_1()); 
            // InternalDsl.g:3801:2: ( rule__Mesh__NameAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDsl.g:3801:3: rule__Mesh__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__1__Impl"


    // $ANTLR start "rule__Mesh__Group__2"
    // InternalDsl.g:3809:1: rule__Mesh__Group__2 : rule__Mesh__Group__2__Impl rule__Mesh__Group__3 ;
    public final void rule__Mesh__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3813:1: ( rule__Mesh__Group__2__Impl rule__Mesh__Group__3 )
            // InternalDsl.g:3814:2: rule__Mesh__Group__2__Impl rule__Mesh__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Mesh__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2"


    // $ANTLR start "rule__Mesh__Group__2__Impl"
    // InternalDsl.g:3821:1: rule__Mesh__Group__2__Impl : ( 'pathToFile' ) ;
    public final void rule__Mesh__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3825:1: ( ( 'pathToFile' ) )
            // InternalDsl.g:3826:1: ( 'pathToFile' )
            {
            // InternalDsl.g:3826:1: ( 'pathToFile' )
            // InternalDsl.g:3827:2: 'pathToFile'
            {
             before(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getPathToFileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__2__Impl"


    // $ANTLR start "rule__Mesh__Group__3"
    // InternalDsl.g:3836:1: rule__Mesh__Group__3 : rule__Mesh__Group__3__Impl rule__Mesh__Group__4 ;
    public final void rule__Mesh__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3840:1: ( rule__Mesh__Group__3__Impl rule__Mesh__Group__4 )
            // InternalDsl.g:3841:2: rule__Mesh__Group__3__Impl rule__Mesh__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__Mesh__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3"


    // $ANTLR start "rule__Mesh__Group__3__Impl"
    // InternalDsl.g:3848:1: rule__Mesh__Group__3__Impl : ( ( rule__Mesh__PathToFileAssignment_3 ) ) ;
    public final void rule__Mesh__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3852:1: ( ( ( rule__Mesh__PathToFileAssignment_3 ) ) )
            // InternalDsl.g:3853:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            {
            // InternalDsl.g:3853:1: ( ( rule__Mesh__PathToFileAssignment_3 ) )
            // InternalDsl.g:3854:2: ( rule__Mesh__PathToFileAssignment_3 )
            {
             before(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 
            // InternalDsl.g:3855:2: ( rule__Mesh__PathToFileAssignment_3 )
            // InternalDsl.g:3855:3: rule__Mesh__PathToFileAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__PathToFileAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getPathToFileAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__3__Impl"


    // $ANTLR start "rule__Mesh__Group__4"
    // InternalDsl.g:3863:1: rule__Mesh__Group__4 : rule__Mesh__Group__4__Impl ;
    public final void rule__Mesh__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3867:1: ( rule__Mesh__Group__4__Impl )
            // InternalDsl.g:3868:2: rule__Mesh__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__4"


    // $ANTLR start "rule__Mesh__Group__4__Impl"
    // InternalDsl.g:3874:1: rule__Mesh__Group__4__Impl : ( ( rule__Mesh__Group_4__0 )? ) ;
    public final void rule__Mesh__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3878:1: ( ( ( rule__Mesh__Group_4__0 )? ) )
            // InternalDsl.g:3879:1: ( ( rule__Mesh__Group_4__0 )? )
            {
            // InternalDsl.g:3879:1: ( ( rule__Mesh__Group_4__0 )? )
            // InternalDsl.g:3880:2: ( rule__Mesh__Group_4__0 )?
            {
             before(grammarAccess.getMeshAccess().getGroup_4()); 
            // InternalDsl.g:3881:2: ( rule__Mesh__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDsl.g:3881:3: rule__Mesh__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mesh__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeshAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group__4__Impl"


    // $ANTLR start "rule__Mesh__Group_4__0"
    // InternalDsl.g:3890:1: rule__Mesh__Group_4__0 : rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 ;
    public final void rule__Mesh__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3894:1: ( rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1 )
            // InternalDsl.g:3895:2: rule__Mesh__Group_4__0__Impl rule__Mesh__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__Mesh__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mesh__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__0"


    // $ANTLR start "rule__Mesh__Group_4__0__Impl"
    // InternalDsl.g:3902:1: rule__Mesh__Group_4__0__Impl : ( 'scale' ) ;
    public final void rule__Mesh__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3906:1: ( ( 'scale' ) )
            // InternalDsl.g:3907:1: ( 'scale' )
            {
            // InternalDsl.g:3907:1: ( 'scale' )
            // InternalDsl.g:3908:2: 'scale'
            {
             before(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getScaleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__0__Impl"


    // $ANTLR start "rule__Mesh__Group_4__1"
    // InternalDsl.g:3917:1: rule__Mesh__Group_4__1 : rule__Mesh__Group_4__1__Impl ;
    public final void rule__Mesh__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3921:1: ( rule__Mesh__Group_4__1__Impl )
            // InternalDsl.g:3922:2: rule__Mesh__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__1"


    // $ANTLR start "rule__Mesh__Group_4__1__Impl"
    // InternalDsl.g:3928:1: rule__Mesh__Group_4__1__Impl : ( ( rule__Mesh__BoxAssignment_4_1 ) ) ;
    public final void rule__Mesh__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3932:1: ( ( ( rule__Mesh__BoxAssignment_4_1 ) ) )
            // InternalDsl.g:3933:1: ( ( rule__Mesh__BoxAssignment_4_1 ) )
            {
            // InternalDsl.g:3933:1: ( ( rule__Mesh__BoxAssignment_4_1 ) )
            // InternalDsl.g:3934:2: ( rule__Mesh__BoxAssignment_4_1 )
            {
             before(grammarAccess.getMeshAccess().getBoxAssignment_4_1()); 
            // InternalDsl.g:3935:2: ( rule__Mesh__BoxAssignment_4_1 )
            // InternalDsl.g:3935:3: rule__Mesh__BoxAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mesh__BoxAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMeshAccess().getBoxAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__Group_4__1__Impl"


    // $ANTLR start "rule__Sphere__Group__0"
    // InternalDsl.g:3944:1: rule__Sphere__Group__0 : rule__Sphere__Group__0__Impl rule__Sphere__Group__1 ;
    public final void rule__Sphere__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3948:1: ( rule__Sphere__Group__0__Impl rule__Sphere__Group__1 )
            // InternalDsl.g:3949:2: rule__Sphere__Group__0__Impl rule__Sphere__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Sphere__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0"


    // $ANTLR start "rule__Sphere__Group__0__Impl"
    // InternalDsl.g:3956:1: rule__Sphere__Group__0__Impl : ( 'Sphere' ) ;
    public final void rule__Sphere__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3960:1: ( ( 'Sphere' ) )
            // InternalDsl.g:3961:1: ( 'Sphere' )
            {
            // InternalDsl.g:3961:1: ( 'Sphere' )
            // InternalDsl.g:3962:2: 'Sphere'
            {
             before(grammarAccess.getSphereAccess().getSphereKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getSphereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__0__Impl"


    // $ANTLR start "rule__Sphere__Group__1"
    // InternalDsl.g:3971:1: rule__Sphere__Group__1 : rule__Sphere__Group__1__Impl rule__Sphere__Group__2 ;
    public final void rule__Sphere__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3975:1: ( rule__Sphere__Group__1__Impl rule__Sphere__Group__2 )
            // InternalDsl.g:3976:2: rule__Sphere__Group__1__Impl rule__Sphere__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Sphere__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1"


    // $ANTLR start "rule__Sphere__Group__1__Impl"
    // InternalDsl.g:3983:1: rule__Sphere__Group__1__Impl : ( ( rule__Sphere__NameAssignment_1 )? ) ;
    public final void rule__Sphere__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3987:1: ( ( ( rule__Sphere__NameAssignment_1 )? ) )
            // InternalDsl.g:3988:1: ( ( rule__Sphere__NameAssignment_1 )? )
            {
            // InternalDsl.g:3988:1: ( ( rule__Sphere__NameAssignment_1 )? )
            // InternalDsl.g:3989:2: ( rule__Sphere__NameAssignment_1 )?
            {
             before(grammarAccess.getSphereAccess().getNameAssignment_1()); 
            // InternalDsl.g:3990:2: ( rule__Sphere__NameAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:3990:3: rule__Sphere__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sphere__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSphereAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__1__Impl"


    // $ANTLR start "rule__Sphere__Group__2"
    // InternalDsl.g:3998:1: rule__Sphere__Group__2 : rule__Sphere__Group__2__Impl rule__Sphere__Group__3 ;
    public final void rule__Sphere__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4002:1: ( rule__Sphere__Group__2__Impl rule__Sphere__Group__3 )
            // InternalDsl.g:4003:2: rule__Sphere__Group__2__Impl rule__Sphere__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Sphere__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2"


    // $ANTLR start "rule__Sphere__Group__2__Impl"
    // InternalDsl.g:4010:1: rule__Sphere__Group__2__Impl : ( 'radius' ) ;
    public final void rule__Sphere__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4014:1: ( ( 'radius' ) )
            // InternalDsl.g:4015:1: ( 'radius' )
            {
            // InternalDsl.g:4015:1: ( 'radius' )
            // InternalDsl.g:4016:2: 'radius'
            {
             before(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getRadiusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__2__Impl"


    // $ANTLR start "rule__Sphere__Group__3"
    // InternalDsl.g:4025:1: rule__Sphere__Group__3 : rule__Sphere__Group__3__Impl ;
    public final void rule__Sphere__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4029:1: ( rule__Sphere__Group__3__Impl )
            // InternalDsl.g:4030:2: rule__Sphere__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3"


    // $ANTLR start "rule__Sphere__Group__3__Impl"
    // InternalDsl.g:4036:1: rule__Sphere__Group__3__Impl : ( ( rule__Sphere__RadiusAssignment_3 ) ) ;
    public final void rule__Sphere__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4040:1: ( ( ( rule__Sphere__RadiusAssignment_3 ) ) )
            // InternalDsl.g:4041:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            {
            // InternalDsl.g:4041:1: ( ( rule__Sphere__RadiusAssignment_3 ) )
            // InternalDsl.g:4042:2: ( rule__Sphere__RadiusAssignment_3 )
            {
             before(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 
            // InternalDsl.g:4043:2: ( rule__Sphere__RadiusAssignment_3 )
            // InternalDsl.g:4043:3: rule__Sphere__RadiusAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Sphere__RadiusAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSphereAccess().getRadiusAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__0"
    // InternalDsl.g:4052:1: rule__Limit__Group__0 : rule__Limit__Group__0__Impl rule__Limit__Group__1 ;
    public final void rule__Limit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4056:1: ( rule__Limit__Group__0__Impl rule__Limit__Group__1 )
            // InternalDsl.g:4057:2: rule__Limit__Group__0__Impl rule__Limit__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Limit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0"


    // $ANTLR start "rule__Limit__Group__0__Impl"
    // InternalDsl.g:4064:1: rule__Limit__Group__0__Impl : ( ( rule__Limit__NameAssignment_0 )? ) ;
    public final void rule__Limit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4068:1: ( ( ( rule__Limit__NameAssignment_0 )? ) )
            // InternalDsl.g:4069:1: ( ( rule__Limit__NameAssignment_0 )? )
            {
            // InternalDsl.g:4069:1: ( ( rule__Limit__NameAssignment_0 )? )
            // InternalDsl.g:4070:2: ( rule__Limit__NameAssignment_0 )?
            {
             before(grammarAccess.getLimitAccess().getNameAssignment_0()); 
            // InternalDsl.g:4071:2: ( rule__Limit__NameAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDsl.g:4071:3: rule__Limit__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__0__Impl"


    // $ANTLR start "rule__Limit__Group__1"
    // InternalDsl.g:4079:1: rule__Limit__Group__1 : rule__Limit__Group__1__Impl rule__Limit__Group__2 ;
    public final void rule__Limit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4083:1: ( rule__Limit__Group__1__Impl rule__Limit__Group__2 )
            // InternalDsl.g:4084:2: rule__Limit__Group__1__Impl rule__Limit__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Limit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1"


    // $ANTLR start "rule__Limit__Group__1__Impl"
    // InternalDsl.g:4091:1: rule__Limit__Group__1__Impl : ( 'effort' ) ;
    public final void rule__Limit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4095:1: ( ( 'effort' ) )
            // InternalDsl.g:4096:1: ( 'effort' )
            {
            // InternalDsl.g:4096:1: ( 'effort' )
            // InternalDsl.g:4097:2: 'effort'
            {
             before(grammarAccess.getLimitAccess().getEffortKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getEffortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__1__Impl"


    // $ANTLR start "rule__Limit__Group__2"
    // InternalDsl.g:4106:1: rule__Limit__Group__2 : rule__Limit__Group__2__Impl rule__Limit__Group__3 ;
    public final void rule__Limit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4110:1: ( rule__Limit__Group__2__Impl rule__Limit__Group__3 )
            // InternalDsl.g:4111:2: rule__Limit__Group__2__Impl rule__Limit__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__Limit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2"


    // $ANTLR start "rule__Limit__Group__2__Impl"
    // InternalDsl.g:4118:1: rule__Limit__Group__2__Impl : ( ( rule__Limit__EffortAssignment_2 ) ) ;
    public final void rule__Limit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4122:1: ( ( ( rule__Limit__EffortAssignment_2 ) ) )
            // InternalDsl.g:4123:1: ( ( rule__Limit__EffortAssignment_2 ) )
            {
            // InternalDsl.g:4123:1: ( ( rule__Limit__EffortAssignment_2 ) )
            // InternalDsl.g:4124:2: ( rule__Limit__EffortAssignment_2 )
            {
             before(grammarAccess.getLimitAccess().getEffortAssignment_2()); 
            // InternalDsl.g:4125:2: ( rule__Limit__EffortAssignment_2 )
            // InternalDsl.g:4125:3: rule__Limit__EffortAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Limit__EffortAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getEffortAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__2__Impl"


    // $ANTLR start "rule__Limit__Group__3"
    // InternalDsl.g:4133:1: rule__Limit__Group__3 : rule__Limit__Group__3__Impl rule__Limit__Group__4 ;
    public final void rule__Limit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4137:1: ( rule__Limit__Group__3__Impl rule__Limit__Group__4 )
            // InternalDsl.g:4138:2: rule__Limit__Group__3__Impl rule__Limit__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Limit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3"


    // $ANTLR start "rule__Limit__Group__3__Impl"
    // InternalDsl.g:4145:1: rule__Limit__Group__3__Impl : ( 'velocity' ) ;
    public final void rule__Limit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4149:1: ( ( 'velocity' ) )
            // InternalDsl.g:4150:1: ( 'velocity' )
            {
            // InternalDsl.g:4150:1: ( 'velocity' )
            // InternalDsl.g:4151:2: 'velocity'
            {
             before(grammarAccess.getLimitAccess().getVelocityKeyword_3()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getVelocityKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__3__Impl"


    // $ANTLR start "rule__Limit__Group__4"
    // InternalDsl.g:4160:1: rule__Limit__Group__4 : rule__Limit__Group__4__Impl rule__Limit__Group__5 ;
    public final void rule__Limit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4164:1: ( rule__Limit__Group__4__Impl rule__Limit__Group__5 )
            // InternalDsl.g:4165:2: rule__Limit__Group__4__Impl rule__Limit__Group__5
            {
            pushFollow(FOLLOW_47);
            rule__Limit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4"


    // $ANTLR start "rule__Limit__Group__4__Impl"
    // InternalDsl.g:4172:1: rule__Limit__Group__4__Impl : ( ( rule__Limit__VelocityAssignment_4 ) ) ;
    public final void rule__Limit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4176:1: ( ( ( rule__Limit__VelocityAssignment_4 ) ) )
            // InternalDsl.g:4177:1: ( ( rule__Limit__VelocityAssignment_4 ) )
            {
            // InternalDsl.g:4177:1: ( ( rule__Limit__VelocityAssignment_4 ) )
            // InternalDsl.g:4178:2: ( rule__Limit__VelocityAssignment_4 )
            {
             before(grammarAccess.getLimitAccess().getVelocityAssignment_4()); 
            // InternalDsl.g:4179:2: ( rule__Limit__VelocityAssignment_4 )
            // InternalDsl.g:4179:3: rule__Limit__VelocityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Limit__VelocityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLimitAccess().getVelocityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__4__Impl"


    // $ANTLR start "rule__Limit__Group__5"
    // InternalDsl.g:4187:1: rule__Limit__Group__5 : rule__Limit__Group__5__Impl rule__Limit__Group__6 ;
    public final void rule__Limit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4191:1: ( rule__Limit__Group__5__Impl rule__Limit__Group__6 )
            // InternalDsl.g:4192:2: rule__Limit__Group__5__Impl rule__Limit__Group__6
            {
            pushFollow(FOLLOW_48);
            rule__Limit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5"


    // $ANTLR start "rule__Limit__Group__5__Impl"
    // InternalDsl.g:4199:1: rule__Limit__Group__5__Impl : ( 'lower' ) ;
    public final void rule__Limit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4203:1: ( ( 'lower' ) )
            // InternalDsl.g:4204:1: ( 'lower' )
            {
            // InternalDsl.g:4204:1: ( 'lower' )
            // InternalDsl.g:4205:2: 'lower'
            {
             before(grammarAccess.getLimitAccess().getLowerKeyword_5()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getLowerKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__5__Impl"


    // $ANTLR start "rule__Limit__Group__6"
    // InternalDsl.g:4214:1: rule__Limit__Group__6 : rule__Limit__Group__6__Impl rule__Limit__Group__7 ;
    public final void rule__Limit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4218:1: ( rule__Limit__Group__6__Impl rule__Limit__Group__7 )
            // InternalDsl.g:4219:2: rule__Limit__Group__6__Impl rule__Limit__Group__7
            {
            pushFollow(FOLLOW_48);
            rule__Limit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6"


    // $ANTLR start "rule__Limit__Group__6__Impl"
    // InternalDsl.g:4226:1: rule__Limit__Group__6__Impl : ( ( rule__Limit__LowerAssignment_6 )? ) ;
    public final void rule__Limit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4230:1: ( ( ( rule__Limit__LowerAssignment_6 )? ) )
            // InternalDsl.g:4231:1: ( ( rule__Limit__LowerAssignment_6 )? )
            {
            // InternalDsl.g:4231:1: ( ( rule__Limit__LowerAssignment_6 )? )
            // InternalDsl.g:4232:2: ( rule__Limit__LowerAssignment_6 )?
            {
             before(grammarAccess.getLimitAccess().getLowerAssignment_6()); 
            // InternalDsl.g:4233:2: ( rule__Limit__LowerAssignment_6 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT||LA37_0==13) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDsl.g:4233:3: rule__Limit__LowerAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__LowerAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getLowerAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__6__Impl"


    // $ANTLR start "rule__Limit__Group__7"
    // InternalDsl.g:4241:1: rule__Limit__Group__7 : rule__Limit__Group__7__Impl rule__Limit__Group__8 ;
    public final void rule__Limit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4245:1: ( rule__Limit__Group__7__Impl rule__Limit__Group__8 )
            // InternalDsl.g:4246:2: rule__Limit__Group__7__Impl rule__Limit__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Limit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Limit__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7"


    // $ANTLR start "rule__Limit__Group__7__Impl"
    // InternalDsl.g:4253:1: rule__Limit__Group__7__Impl : ( 'upper' ) ;
    public final void rule__Limit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4257:1: ( ( 'upper' ) )
            // InternalDsl.g:4258:1: ( 'upper' )
            {
            // InternalDsl.g:4258:1: ( 'upper' )
            // InternalDsl.g:4259:2: 'upper'
            {
             before(grammarAccess.getLimitAccess().getUpperKeyword_7()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getUpperKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__7__Impl"


    // $ANTLR start "rule__Limit__Group__8"
    // InternalDsl.g:4268:1: rule__Limit__Group__8 : rule__Limit__Group__8__Impl ;
    public final void rule__Limit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4272:1: ( rule__Limit__Group__8__Impl )
            // InternalDsl.g:4273:2: rule__Limit__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Limit__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__8"


    // $ANTLR start "rule__Limit__Group__8__Impl"
    // InternalDsl.g:4279:1: rule__Limit__Group__8__Impl : ( ( rule__Limit__UpperAssignment_8 )? ) ;
    public final void rule__Limit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4283:1: ( ( ( rule__Limit__UpperAssignment_8 )? ) )
            // InternalDsl.g:4284:1: ( ( rule__Limit__UpperAssignment_8 )? )
            {
            // InternalDsl.g:4284:1: ( ( rule__Limit__UpperAssignment_8 )? )
            // InternalDsl.g:4285:2: ( rule__Limit__UpperAssignment_8 )?
            {
             before(grammarAccess.getLimitAccess().getUpperAssignment_8()); 
            // InternalDsl.g:4286:2: ( rule__Limit__UpperAssignment_8 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT||LA38_0==13) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDsl.g:4286:3: rule__Limit__UpperAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Limit__UpperAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLimitAccess().getUpperAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__Group__8__Impl"


    // $ANTLR start "rule__Axis__Group__0"
    // InternalDsl.g:4295:1: rule__Axis__Group__0 : rule__Axis__Group__0__Impl rule__Axis__Group__1 ;
    public final void rule__Axis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4299:1: ( rule__Axis__Group__0__Impl rule__Axis__Group__1 )
            // InternalDsl.g:4300:2: rule__Axis__Group__0__Impl rule__Axis__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Axis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0"


    // $ANTLR start "rule__Axis__Group__0__Impl"
    // InternalDsl.g:4307:1: rule__Axis__Group__0__Impl : ( ( rule__Axis__NameAssignment_0 )? ) ;
    public final void rule__Axis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4311:1: ( ( ( rule__Axis__NameAssignment_0 )? ) )
            // InternalDsl.g:4312:1: ( ( rule__Axis__NameAssignment_0 )? )
            {
            // InternalDsl.g:4312:1: ( ( rule__Axis__NameAssignment_0 )? )
            // InternalDsl.g:4313:2: ( rule__Axis__NameAssignment_0 )?
            {
             before(grammarAccess.getAxisAccess().getNameAssignment_0()); 
            // InternalDsl.g:4314:2: ( rule__Axis__NameAssignment_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDsl.g:4314:3: rule__Axis__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Axis__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxisAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__0__Impl"


    // $ANTLR start "rule__Axis__Group__1"
    // InternalDsl.g:4322:1: rule__Axis__Group__1 : rule__Axis__Group__1__Impl rule__Axis__Group__2 ;
    public final void rule__Axis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4326:1: ( rule__Axis__Group__1__Impl rule__Axis__Group__2 )
            // InternalDsl.g:4327:2: rule__Axis__Group__1__Impl rule__Axis__Group__2
            {
            pushFollow(FOLLOW_49);
            rule__Axis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1"


    // $ANTLR start "rule__Axis__Group__1__Impl"
    // InternalDsl.g:4334:1: rule__Axis__Group__1__Impl : ( 'xyz' ) ;
    public final void rule__Axis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4338:1: ( ( 'xyz' ) )
            // InternalDsl.g:4339:1: ( 'xyz' )
            {
            // InternalDsl.g:4339:1: ( 'xyz' )
            // InternalDsl.g:4340:2: 'xyz'
            {
             before(grammarAccess.getAxisAccess().getXyzKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXyzKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__1__Impl"


    // $ANTLR start "rule__Axis__Group__2"
    // InternalDsl.g:4349:1: rule__Axis__Group__2 : rule__Axis__Group__2__Impl rule__Axis__Group__3 ;
    public final void rule__Axis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4353:1: ( rule__Axis__Group__2__Impl rule__Axis__Group__3 )
            // InternalDsl.g:4354:2: rule__Axis__Group__2__Impl rule__Axis__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Axis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2"


    // $ANTLR start "rule__Axis__Group__2__Impl"
    // InternalDsl.g:4361:1: rule__Axis__Group__2__Impl : ( ( rule__Axis__XAssignment_2 ) ) ;
    public final void rule__Axis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4365:1: ( ( ( rule__Axis__XAssignment_2 ) ) )
            // InternalDsl.g:4366:1: ( ( rule__Axis__XAssignment_2 ) )
            {
            // InternalDsl.g:4366:1: ( ( rule__Axis__XAssignment_2 ) )
            // InternalDsl.g:4367:2: ( rule__Axis__XAssignment_2 )
            {
             before(grammarAccess.getAxisAccess().getXAssignment_2()); 
            // InternalDsl.g:4368:2: ( rule__Axis__XAssignment_2 )
            // InternalDsl.g:4368:3: rule__Axis__XAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Axis__XAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getXAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__2__Impl"


    // $ANTLR start "rule__Axis__Group__3"
    // InternalDsl.g:4376:1: rule__Axis__Group__3 : rule__Axis__Group__3__Impl rule__Axis__Group__4 ;
    public final void rule__Axis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4380:1: ( rule__Axis__Group__3__Impl rule__Axis__Group__4 )
            // InternalDsl.g:4381:2: rule__Axis__Group__3__Impl rule__Axis__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__Axis__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Axis__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3"


    // $ANTLR start "rule__Axis__Group__3__Impl"
    // InternalDsl.g:4388:1: rule__Axis__Group__3__Impl : ( ( rule__Axis__YAssignment_3 ) ) ;
    public final void rule__Axis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4392:1: ( ( ( rule__Axis__YAssignment_3 ) ) )
            // InternalDsl.g:4393:1: ( ( rule__Axis__YAssignment_3 ) )
            {
            // InternalDsl.g:4393:1: ( ( rule__Axis__YAssignment_3 ) )
            // InternalDsl.g:4394:2: ( rule__Axis__YAssignment_3 )
            {
             before(grammarAccess.getAxisAccess().getYAssignment_3()); 
            // InternalDsl.g:4395:2: ( rule__Axis__YAssignment_3 )
            // InternalDsl.g:4395:3: rule__Axis__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Axis__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__3__Impl"


    // $ANTLR start "rule__Axis__Group__4"
    // InternalDsl.g:4403:1: rule__Axis__Group__4 : rule__Axis__Group__4__Impl ;
    public final void rule__Axis__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4407:1: ( rule__Axis__Group__4__Impl )
            // InternalDsl.g:4408:2: rule__Axis__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Axis__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4"


    // $ANTLR start "rule__Axis__Group__4__Impl"
    // InternalDsl.g:4414:1: rule__Axis__Group__4__Impl : ( ( rule__Axis__ZAssignment_4 ) ) ;
    public final void rule__Axis__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4418:1: ( ( ( rule__Axis__ZAssignment_4 ) ) )
            // InternalDsl.g:4419:1: ( ( rule__Axis__ZAssignment_4 ) )
            {
            // InternalDsl.g:4419:1: ( ( rule__Axis__ZAssignment_4 ) )
            // InternalDsl.g:4420:2: ( rule__Axis__ZAssignment_4 )
            {
             before(grammarAccess.getAxisAccess().getZAssignment_4()); 
            // InternalDsl.g:4421:2: ( rule__Axis__ZAssignment_4 )
            // InternalDsl.g:4421:3: rule__Axis__ZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Axis__ZAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getZAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__Group__4__Impl"


    // $ANTLR start "rule__Calibration__Group__0"
    // InternalDsl.g:4430:1: rule__Calibration__Group__0 : rule__Calibration__Group__0__Impl rule__Calibration__Group__1 ;
    public final void rule__Calibration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4434:1: ( rule__Calibration__Group__0__Impl rule__Calibration__Group__1 )
            // InternalDsl.g:4435:2: rule__Calibration__Group__0__Impl rule__Calibration__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Calibration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0"


    // $ANTLR start "rule__Calibration__Group__0__Impl"
    // InternalDsl.g:4442:1: rule__Calibration__Group__0__Impl : ( () ) ;
    public final void rule__Calibration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4446:1: ( ( () ) )
            // InternalDsl.g:4447:1: ( () )
            {
            // InternalDsl.g:4447:1: ( () )
            // InternalDsl.g:4448:2: ()
            {
             before(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 
            // InternalDsl.g:4449:2: ()
            // InternalDsl.g:4449:3: 
            {
            }

             after(grammarAccess.getCalibrationAccess().getCalibrationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__0__Impl"


    // $ANTLR start "rule__Calibration__Group__1"
    // InternalDsl.g:4457:1: rule__Calibration__Group__1 : rule__Calibration__Group__1__Impl rule__Calibration__Group__2 ;
    public final void rule__Calibration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4461:1: ( rule__Calibration__Group__1__Impl rule__Calibration__Group__2 )
            // InternalDsl.g:4462:2: rule__Calibration__Group__1__Impl rule__Calibration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Calibration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__1"


    // $ANTLR start "rule__Calibration__Group__1__Impl"
    // InternalDsl.g:4469:1: rule__Calibration__Group__1__Impl : ( ( rule__Calibration__NameAssignment_1 )? ) ;
    public final void rule__Calibration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4473:1: ( ( ( rule__Calibration__NameAssignment_1 )? ) )
            // InternalDsl.g:4474:1: ( ( rule__Calibration__NameAssignment_1 )? )
            {
            // InternalDsl.g:4474:1: ( ( rule__Calibration__NameAssignment_1 )? )
            // InternalDsl.g:4475:2: ( rule__Calibration__NameAssignment_1 )?
            {
             before(grammarAccess.getCalibrationAccess().getNameAssignment_1()); 
            // InternalDsl.g:4476:2: ( rule__Calibration__NameAssignment_1 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDsl.g:4476:3: rule__Calibration__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__1__Impl"


    // $ANTLR start "rule__Calibration__Group__2"
    // InternalDsl.g:4484:1: rule__Calibration__Group__2 : rule__Calibration__Group__2__Impl rule__Calibration__Group__3 ;
    public final void rule__Calibration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4488:1: ( rule__Calibration__Group__2__Impl rule__Calibration__Group__3 )
            // InternalDsl.g:4489:2: rule__Calibration__Group__2__Impl rule__Calibration__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Calibration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__2"


    // $ANTLR start "rule__Calibration__Group__2__Impl"
    // InternalDsl.g:4496:1: rule__Calibration__Group__2__Impl : ( ( rule__Calibration__Group_2__0 )? ) ;
    public final void rule__Calibration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4500:1: ( ( ( rule__Calibration__Group_2__0 )? ) )
            // InternalDsl.g:4501:1: ( ( rule__Calibration__Group_2__0 )? )
            {
            // InternalDsl.g:4501:1: ( ( rule__Calibration__Group_2__0 )? )
            // InternalDsl.g:4502:2: ( rule__Calibration__Group_2__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_2()); 
            // InternalDsl.g:4503:2: ( rule__Calibration__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDsl.g:4503:3: rule__Calibration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__2__Impl"


    // $ANTLR start "rule__Calibration__Group__3"
    // InternalDsl.g:4511:1: rule__Calibration__Group__3 : rule__Calibration__Group__3__Impl ;
    public final void rule__Calibration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4515:1: ( rule__Calibration__Group__3__Impl )
            // InternalDsl.g:4516:2: rule__Calibration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__3"


    // $ANTLR start "rule__Calibration__Group__3__Impl"
    // InternalDsl.g:4522:1: rule__Calibration__Group__3__Impl : ( ( rule__Calibration__Group_3__0 )? ) ;
    public final void rule__Calibration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4526:1: ( ( ( rule__Calibration__Group_3__0 )? ) )
            // InternalDsl.g:4527:1: ( ( rule__Calibration__Group_3__0 )? )
            {
            // InternalDsl.g:4527:1: ( ( rule__Calibration__Group_3__0 )? )
            // InternalDsl.g:4528:2: ( rule__Calibration__Group_3__0 )?
            {
             before(grammarAccess.getCalibrationAccess().getGroup_3()); 
            // InternalDsl.g:4529:2: ( rule__Calibration__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDsl.g:4529:3: rule__Calibration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Calibration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCalibrationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group__3__Impl"


    // $ANTLR start "rule__Calibration__Group_2__0"
    // InternalDsl.g:4538:1: rule__Calibration__Group_2__0 : rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1 ;
    public final void rule__Calibration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4542:1: ( rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1 )
            // InternalDsl.g:4543:2: rule__Calibration__Group_2__0__Impl rule__Calibration__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__Calibration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__0"


    // $ANTLR start "rule__Calibration__Group_2__0__Impl"
    // InternalDsl.g:4550:1: rule__Calibration__Group_2__0__Impl : ( 'rising' ) ;
    public final void rule__Calibration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4554:1: ( ( 'rising' ) )
            // InternalDsl.g:4555:1: ( 'rising' )
            {
            // InternalDsl.g:4555:1: ( 'rising' )
            // InternalDsl.g:4556:2: 'rising'
            {
             before(grammarAccess.getCalibrationAccess().getRisingKeyword_2_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getRisingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__0__Impl"


    // $ANTLR start "rule__Calibration__Group_2__1"
    // InternalDsl.g:4565:1: rule__Calibration__Group_2__1 : rule__Calibration__Group_2__1__Impl ;
    public final void rule__Calibration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4569:1: ( rule__Calibration__Group_2__1__Impl )
            // InternalDsl.g:4570:2: rule__Calibration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__1"


    // $ANTLR start "rule__Calibration__Group_2__1__Impl"
    // InternalDsl.g:4576:1: rule__Calibration__Group_2__1__Impl : ( ( rule__Calibration__RisingAssignment_2_1 ) ) ;
    public final void rule__Calibration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4580:1: ( ( ( rule__Calibration__RisingAssignment_2_1 ) ) )
            // InternalDsl.g:4581:1: ( ( rule__Calibration__RisingAssignment_2_1 ) )
            {
            // InternalDsl.g:4581:1: ( ( rule__Calibration__RisingAssignment_2_1 ) )
            // InternalDsl.g:4582:2: ( rule__Calibration__RisingAssignment_2_1 )
            {
             before(grammarAccess.getCalibrationAccess().getRisingAssignment_2_1()); 
            // InternalDsl.g:4583:2: ( rule__Calibration__RisingAssignment_2_1 )
            // InternalDsl.g:4583:3: rule__Calibration__RisingAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__RisingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getRisingAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_2__1__Impl"


    // $ANTLR start "rule__Calibration__Group_3__0"
    // InternalDsl.g:4592:1: rule__Calibration__Group_3__0 : rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 ;
    public final void rule__Calibration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4596:1: ( rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1 )
            // InternalDsl.g:4597:2: rule__Calibration__Group_3__0__Impl rule__Calibration__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Calibration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0"


    // $ANTLR start "rule__Calibration__Group_3__0__Impl"
    // InternalDsl.g:4604:1: rule__Calibration__Group_3__0__Impl : ( 'falling' ) ;
    public final void rule__Calibration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4608:1: ( ( 'falling' ) )
            // InternalDsl.g:4609:1: ( 'falling' )
            {
            // InternalDsl.g:4609:1: ( 'falling' )
            // InternalDsl.g:4610:2: 'falling'
            {
             before(grammarAccess.getCalibrationAccess().getFallingKeyword_3_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getFallingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__0__Impl"


    // $ANTLR start "rule__Calibration__Group_3__1"
    // InternalDsl.g:4619:1: rule__Calibration__Group_3__1 : rule__Calibration__Group_3__1__Impl ;
    public final void rule__Calibration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4623:1: ( rule__Calibration__Group_3__1__Impl )
            // InternalDsl.g:4624:2: rule__Calibration__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1"


    // $ANTLR start "rule__Calibration__Group_3__1__Impl"
    // InternalDsl.g:4630:1: rule__Calibration__Group_3__1__Impl : ( ( rule__Calibration__FallingAssignment_3_1 ) ) ;
    public final void rule__Calibration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4634:1: ( ( ( rule__Calibration__FallingAssignment_3_1 ) ) )
            // InternalDsl.g:4635:1: ( ( rule__Calibration__FallingAssignment_3_1 ) )
            {
            // InternalDsl.g:4635:1: ( ( rule__Calibration__FallingAssignment_3_1 ) )
            // InternalDsl.g:4636:2: ( rule__Calibration__FallingAssignment_3_1 )
            {
             before(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1()); 
            // InternalDsl.g:4637:2: ( rule__Calibration__FallingAssignment_3_1 )
            // InternalDsl.g:4637:3: rule__Calibration__FallingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Calibration__FallingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__Group_3__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__0"
    // InternalDsl.g:4646:1: rule__Dynamics__Group__0 : rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 ;
    public final void rule__Dynamics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4650:1: ( rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1 )
            // InternalDsl.g:4651:2: rule__Dynamics__Group__0__Impl rule__Dynamics__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Dynamics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0"


    // $ANTLR start "rule__Dynamics__Group__0__Impl"
    // InternalDsl.g:4658:1: rule__Dynamics__Group__0__Impl : ( () ) ;
    public final void rule__Dynamics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4662:1: ( ( () ) )
            // InternalDsl.g:4663:1: ( () )
            {
            // InternalDsl.g:4663:1: ( () )
            // InternalDsl.g:4664:2: ()
            {
             before(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 
            // InternalDsl.g:4665:2: ()
            // InternalDsl.g:4665:3: 
            {
            }

             after(grammarAccess.getDynamicsAccess().getDynamicsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__0__Impl"


    // $ANTLR start "rule__Dynamics__Group__1"
    // InternalDsl.g:4673:1: rule__Dynamics__Group__1 : rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 ;
    public final void rule__Dynamics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4677:1: ( rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2 )
            // InternalDsl.g:4678:2: rule__Dynamics__Group__1__Impl rule__Dynamics__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Dynamics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__1"


    // $ANTLR start "rule__Dynamics__Group__1__Impl"
    // InternalDsl.g:4685:1: rule__Dynamics__Group__1__Impl : ( ( rule__Dynamics__NameAssignment_1 )? ) ;
    public final void rule__Dynamics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4689:1: ( ( ( rule__Dynamics__NameAssignment_1 )? ) )
            // InternalDsl.g:4690:1: ( ( rule__Dynamics__NameAssignment_1 )? )
            {
            // InternalDsl.g:4690:1: ( ( rule__Dynamics__NameAssignment_1 )? )
            // InternalDsl.g:4691:2: ( rule__Dynamics__NameAssignment_1 )?
            {
             before(grammarAccess.getDynamicsAccess().getNameAssignment_1()); 
            // InternalDsl.g:4692:2: ( rule__Dynamics__NameAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDsl.g:4692:3: rule__Dynamics__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__1__Impl"


    // $ANTLR start "rule__Dynamics__Group__2"
    // InternalDsl.g:4700:1: rule__Dynamics__Group__2 : rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 ;
    public final void rule__Dynamics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4704:1: ( rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3 )
            // InternalDsl.g:4705:2: rule__Dynamics__Group__2__Impl rule__Dynamics__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Dynamics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__2"


    // $ANTLR start "rule__Dynamics__Group__2__Impl"
    // InternalDsl.g:4712:1: rule__Dynamics__Group__2__Impl : ( ( rule__Dynamics__Group_2__0 )? ) ;
    public final void rule__Dynamics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4716:1: ( ( ( rule__Dynamics__Group_2__0 )? ) )
            // InternalDsl.g:4717:1: ( ( rule__Dynamics__Group_2__0 )? )
            {
            // InternalDsl.g:4717:1: ( ( rule__Dynamics__Group_2__0 )? )
            // InternalDsl.g:4718:2: ( rule__Dynamics__Group_2__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_2()); 
            // InternalDsl.g:4719:2: ( rule__Dynamics__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDsl.g:4719:3: rule__Dynamics__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__2__Impl"


    // $ANTLR start "rule__Dynamics__Group__3"
    // InternalDsl.g:4727:1: rule__Dynamics__Group__3 : rule__Dynamics__Group__3__Impl ;
    public final void rule__Dynamics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4731:1: ( rule__Dynamics__Group__3__Impl )
            // InternalDsl.g:4732:2: rule__Dynamics__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__3"


    // $ANTLR start "rule__Dynamics__Group__3__Impl"
    // InternalDsl.g:4738:1: rule__Dynamics__Group__3__Impl : ( ( rule__Dynamics__Group_3__0 )? ) ;
    public final void rule__Dynamics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4742:1: ( ( ( rule__Dynamics__Group_3__0 )? ) )
            // InternalDsl.g:4743:1: ( ( rule__Dynamics__Group_3__0 )? )
            {
            // InternalDsl.g:4743:1: ( ( rule__Dynamics__Group_3__0 )? )
            // InternalDsl.g:4744:2: ( rule__Dynamics__Group_3__0 )?
            {
             before(grammarAccess.getDynamicsAccess().getGroup_3()); 
            // InternalDsl.g:4745:2: ( rule__Dynamics__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==66) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDsl.g:4745:3: rule__Dynamics__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dynamics__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDynamicsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group__3__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__0"
    // InternalDsl.g:4754:1: rule__Dynamics__Group_2__0 : rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 ;
    public final void rule__Dynamics__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4758:1: ( rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1 )
            // InternalDsl.g:4759:2: rule__Dynamics__Group_2__0__Impl rule__Dynamics__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__Dynamics__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__0"


    // $ANTLR start "rule__Dynamics__Group_2__0__Impl"
    // InternalDsl.g:4766:1: rule__Dynamics__Group_2__0__Impl : ( 'friction' ) ;
    public final void rule__Dynamics__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4770:1: ( ( 'friction' ) )
            // InternalDsl.g:4771:1: ( 'friction' )
            {
            // InternalDsl.g:4771:1: ( 'friction' )
            // InternalDsl.g:4772:2: 'friction'
            {
             before(grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getFrictionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_2__1"
    // InternalDsl.g:4781:1: rule__Dynamics__Group_2__1 : rule__Dynamics__Group_2__1__Impl ;
    public final void rule__Dynamics__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4785:1: ( rule__Dynamics__Group_2__1__Impl )
            // InternalDsl.g:4786:2: rule__Dynamics__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__1"


    // $ANTLR start "rule__Dynamics__Group_2__1__Impl"
    // InternalDsl.g:4792:1: rule__Dynamics__Group_2__1__Impl : ( ( rule__Dynamics__FrictionAssignment_2_1 ) ) ;
    public final void rule__Dynamics__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4796:1: ( ( ( rule__Dynamics__FrictionAssignment_2_1 ) ) )
            // InternalDsl.g:4797:1: ( ( rule__Dynamics__FrictionAssignment_2_1 ) )
            {
            // InternalDsl.g:4797:1: ( ( rule__Dynamics__FrictionAssignment_2_1 ) )
            // InternalDsl.g:4798:2: ( rule__Dynamics__FrictionAssignment_2_1 )
            {
             before(grammarAccess.getDynamicsAccess().getFrictionAssignment_2_1()); 
            // InternalDsl.g:4799:2: ( rule__Dynamics__FrictionAssignment_2_1 )
            // InternalDsl.g:4799:3: rule__Dynamics__FrictionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__FrictionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getFrictionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_2__1__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__0"
    // InternalDsl.g:4808:1: rule__Dynamics__Group_3__0 : rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 ;
    public final void rule__Dynamics__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4812:1: ( rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1 )
            // InternalDsl.g:4813:2: rule__Dynamics__Group_3__0__Impl rule__Dynamics__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Dynamics__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0"


    // $ANTLR start "rule__Dynamics__Group_3__0__Impl"
    // InternalDsl.g:4820:1: rule__Dynamics__Group_3__0__Impl : ( 'damping' ) ;
    public final void rule__Dynamics__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4824:1: ( ( 'damping' ) )
            // InternalDsl.g:4825:1: ( 'damping' )
            {
            // InternalDsl.g:4825:1: ( 'damping' )
            // InternalDsl.g:4826:2: 'damping'
            {
             before(grammarAccess.getDynamicsAccess().getDampingKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getDampingKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__0__Impl"


    // $ANTLR start "rule__Dynamics__Group_3__1"
    // InternalDsl.g:4835:1: rule__Dynamics__Group_3__1 : rule__Dynamics__Group_3__1__Impl ;
    public final void rule__Dynamics__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4839:1: ( rule__Dynamics__Group_3__1__Impl )
            // InternalDsl.g:4840:2: rule__Dynamics__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1"


    // $ANTLR start "rule__Dynamics__Group_3__1__Impl"
    // InternalDsl.g:4846:1: rule__Dynamics__Group_3__1__Impl : ( ( rule__Dynamics__DampingAssignment_3_1 ) ) ;
    public final void rule__Dynamics__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4850:1: ( ( ( rule__Dynamics__DampingAssignment_3_1 ) ) )
            // InternalDsl.g:4851:1: ( ( rule__Dynamics__DampingAssignment_3_1 ) )
            {
            // InternalDsl.g:4851:1: ( ( rule__Dynamics__DampingAssignment_3_1 ) )
            // InternalDsl.g:4852:2: ( rule__Dynamics__DampingAssignment_3_1 )
            {
             before(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1()); 
            // InternalDsl.g:4853:2: ( rule__Dynamics__DampingAssignment_3_1 )
            // InternalDsl.g:4853:3: rule__Dynamics__DampingAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Dynamics__DampingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__Group_3__1__Impl"


    // $ANTLR start "rule__Mimic__Group__0"
    // InternalDsl.g:4862:1: rule__Mimic__Group__0 : rule__Mimic__Group__0__Impl rule__Mimic__Group__1 ;
    public final void rule__Mimic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4866:1: ( rule__Mimic__Group__0__Impl rule__Mimic__Group__1 )
            // InternalDsl.g:4867:2: rule__Mimic__Group__0__Impl rule__Mimic__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Mimic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0"


    // $ANTLR start "rule__Mimic__Group__0__Impl"
    // InternalDsl.g:4874:1: rule__Mimic__Group__0__Impl : ( ( rule__Mimic__NameAssignment_0 )? ) ;
    public final void rule__Mimic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4878:1: ( ( ( rule__Mimic__NameAssignment_0 )? ) )
            // InternalDsl.g:4879:1: ( ( rule__Mimic__NameAssignment_0 )? )
            {
            // InternalDsl.g:4879:1: ( ( rule__Mimic__NameAssignment_0 )? )
            // InternalDsl.g:4880:2: ( rule__Mimic__NameAssignment_0 )?
            {
             before(grammarAccess.getMimicAccess().getNameAssignment_0()); 
            // InternalDsl.g:4881:2: ( rule__Mimic__NameAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDsl.g:4881:3: rule__Mimic__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__0__Impl"


    // $ANTLR start "rule__Mimic__Group__1"
    // InternalDsl.g:4889:1: rule__Mimic__Group__1 : rule__Mimic__Group__1__Impl rule__Mimic__Group__2 ;
    public final void rule__Mimic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4893:1: ( rule__Mimic__Group__1__Impl rule__Mimic__Group__2 )
            // InternalDsl.g:4894:2: rule__Mimic__Group__1__Impl rule__Mimic__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Mimic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__1"


    // $ANTLR start "rule__Mimic__Group__1__Impl"
    // InternalDsl.g:4901:1: rule__Mimic__Group__1__Impl : ( 'mimics' ) ;
    public final void rule__Mimic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4905:1: ( ( 'mimics' ) )
            // InternalDsl.g:4906:1: ( 'mimics' )
            {
            // InternalDsl.g:4906:1: ( 'mimics' )
            // InternalDsl.g:4907:2: 'mimics'
            {
             before(grammarAccess.getMimicAccess().getMimicsKeyword_1()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMimicsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__1__Impl"


    // $ANTLR start "rule__Mimic__Group__2"
    // InternalDsl.g:4916:1: rule__Mimic__Group__2 : rule__Mimic__Group__2__Impl rule__Mimic__Group__3 ;
    public final void rule__Mimic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4920:1: ( rule__Mimic__Group__2__Impl rule__Mimic__Group__3 )
            // InternalDsl.g:4921:2: rule__Mimic__Group__2__Impl rule__Mimic__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__Mimic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__2"


    // $ANTLR start "rule__Mimic__Group__2__Impl"
    // InternalDsl.g:4928:1: rule__Mimic__Group__2__Impl : ( ( rule__Mimic__MimicsAssignment_2 ) ) ;
    public final void rule__Mimic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4932:1: ( ( ( rule__Mimic__MimicsAssignment_2 ) ) )
            // InternalDsl.g:4933:1: ( ( rule__Mimic__MimicsAssignment_2 ) )
            {
            // InternalDsl.g:4933:1: ( ( rule__Mimic__MimicsAssignment_2 ) )
            // InternalDsl.g:4934:2: ( rule__Mimic__MimicsAssignment_2 )
            {
             before(grammarAccess.getMimicAccess().getMimicsAssignment_2()); 
            // InternalDsl.g:4935:2: ( rule__Mimic__MimicsAssignment_2 )
            // InternalDsl.g:4935:3: rule__Mimic__MimicsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__MimicsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getMimicsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__2__Impl"


    // $ANTLR start "rule__Mimic__Group__3"
    // InternalDsl.g:4943:1: rule__Mimic__Group__3 : rule__Mimic__Group__3__Impl rule__Mimic__Group__4 ;
    public final void rule__Mimic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4947:1: ( rule__Mimic__Group__3__Impl rule__Mimic__Group__4 )
            // InternalDsl.g:4948:2: rule__Mimic__Group__3__Impl rule__Mimic__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__Mimic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__3"


    // $ANTLR start "rule__Mimic__Group__3__Impl"
    // InternalDsl.g:4955:1: rule__Mimic__Group__3__Impl : ( ( rule__Mimic__Group_3__0 )? ) ;
    public final void rule__Mimic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4959:1: ( ( ( rule__Mimic__Group_3__0 )? ) )
            // InternalDsl.g:4960:1: ( ( rule__Mimic__Group_3__0 )? )
            {
            // InternalDsl.g:4960:1: ( ( rule__Mimic__Group_3__0 )? )
            // InternalDsl.g:4961:2: ( rule__Mimic__Group_3__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_3()); 
            // InternalDsl.g:4962:2: ( rule__Mimic__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==68) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDsl.g:4962:3: rule__Mimic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__3__Impl"


    // $ANTLR start "rule__Mimic__Group__4"
    // InternalDsl.g:4970:1: rule__Mimic__Group__4 : rule__Mimic__Group__4__Impl ;
    public final void rule__Mimic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4974:1: ( rule__Mimic__Group__4__Impl )
            // InternalDsl.g:4975:2: rule__Mimic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__4"


    // $ANTLR start "rule__Mimic__Group__4__Impl"
    // InternalDsl.g:4981:1: rule__Mimic__Group__4__Impl : ( ( rule__Mimic__Group_4__0 )? ) ;
    public final void rule__Mimic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4985:1: ( ( ( rule__Mimic__Group_4__0 )? ) )
            // InternalDsl.g:4986:1: ( ( rule__Mimic__Group_4__0 )? )
            {
            // InternalDsl.g:4986:1: ( ( rule__Mimic__Group_4__0 )? )
            // InternalDsl.g:4987:2: ( rule__Mimic__Group_4__0 )?
            {
             before(grammarAccess.getMimicAccess().getGroup_4()); 
            // InternalDsl.g:4988:2: ( rule__Mimic__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==69) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDsl.g:4988:3: rule__Mimic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mimic__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMimicAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group__4__Impl"


    // $ANTLR start "rule__Mimic__Group_3__0"
    // InternalDsl.g:4997:1: rule__Mimic__Group_3__0 : rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 ;
    public final void rule__Mimic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5001:1: ( rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1 )
            // InternalDsl.g:5002:2: rule__Mimic__Group_3__0__Impl rule__Mimic__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Mimic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__0"


    // $ANTLR start "rule__Mimic__Group_3__0__Impl"
    // InternalDsl.g:5009:1: rule__Mimic__Group_3__0__Impl : ( 'multiplier' ) ;
    public final void rule__Mimic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5013:1: ( ( 'multiplier' ) )
            // InternalDsl.g:5014:1: ( 'multiplier' )
            {
            // InternalDsl.g:5014:1: ( 'multiplier' )
            // InternalDsl.g:5015:2: 'multiplier'
            {
             before(grammarAccess.getMimicAccess().getMultiplierKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMultiplierKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__0__Impl"


    // $ANTLR start "rule__Mimic__Group_3__1"
    // InternalDsl.g:5024:1: rule__Mimic__Group_3__1 : rule__Mimic__Group_3__1__Impl ;
    public final void rule__Mimic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5028:1: ( rule__Mimic__Group_3__1__Impl )
            // InternalDsl.g:5029:2: rule__Mimic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__1"


    // $ANTLR start "rule__Mimic__Group_3__1__Impl"
    // InternalDsl.g:5035:1: rule__Mimic__Group_3__1__Impl : ( ( rule__Mimic__MultiplierAssignment_3_1 ) ) ;
    public final void rule__Mimic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5039:1: ( ( ( rule__Mimic__MultiplierAssignment_3_1 ) ) )
            // InternalDsl.g:5040:1: ( ( rule__Mimic__MultiplierAssignment_3_1 ) )
            {
            // InternalDsl.g:5040:1: ( ( rule__Mimic__MultiplierAssignment_3_1 ) )
            // InternalDsl.g:5041:2: ( rule__Mimic__MultiplierAssignment_3_1 )
            {
             before(grammarAccess.getMimicAccess().getMultiplierAssignment_3_1()); 
            // InternalDsl.g:5042:2: ( rule__Mimic__MultiplierAssignment_3_1 )
            // InternalDsl.g:5042:3: rule__Mimic__MultiplierAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__MultiplierAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getMultiplierAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_3__1__Impl"


    // $ANTLR start "rule__Mimic__Group_4__0"
    // InternalDsl.g:5051:1: rule__Mimic__Group_4__0 : rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1 ;
    public final void rule__Mimic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5055:1: ( rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1 )
            // InternalDsl.g:5056:2: rule__Mimic__Group_4__0__Impl rule__Mimic__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__Mimic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mimic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__0"


    // $ANTLR start "rule__Mimic__Group_4__0__Impl"
    // InternalDsl.g:5063:1: rule__Mimic__Group_4__0__Impl : ( 'offSet' ) ;
    public final void rule__Mimic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5067:1: ( ( 'offSet' ) )
            // InternalDsl.g:5068:1: ( 'offSet' )
            {
            // InternalDsl.g:5068:1: ( 'offSet' )
            // InternalDsl.g:5069:2: 'offSet'
            {
             before(grammarAccess.getMimicAccess().getOffSetKeyword_4_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getOffSetKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__0__Impl"


    // $ANTLR start "rule__Mimic__Group_4__1"
    // InternalDsl.g:5078:1: rule__Mimic__Group_4__1 : rule__Mimic__Group_4__1__Impl ;
    public final void rule__Mimic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5082:1: ( rule__Mimic__Group_4__1__Impl )
            // InternalDsl.g:5083:2: rule__Mimic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__1"


    // $ANTLR start "rule__Mimic__Group_4__1__Impl"
    // InternalDsl.g:5089:1: rule__Mimic__Group_4__1__Impl : ( ( rule__Mimic__OffSetAssignment_4_1 ) ) ;
    public final void rule__Mimic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5093:1: ( ( ( rule__Mimic__OffSetAssignment_4_1 ) ) )
            // InternalDsl.g:5094:1: ( ( rule__Mimic__OffSetAssignment_4_1 ) )
            {
            // InternalDsl.g:5094:1: ( ( rule__Mimic__OffSetAssignment_4_1 ) )
            // InternalDsl.g:5095:2: ( rule__Mimic__OffSetAssignment_4_1 )
            {
             before(grammarAccess.getMimicAccess().getOffSetAssignment_4_1()); 
            // InternalDsl.g:5096:2: ( rule__Mimic__OffSetAssignment_4_1 )
            // InternalDsl.g:5096:3: rule__Mimic__OffSetAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mimic__OffSetAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMimicAccess().getOffSetAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__Group_4__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__0"
    // InternalDsl.g:5105:1: rule__SafetyController__Group__0 : rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 ;
    public final void rule__SafetyController__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5109:1: ( rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1 )
            // InternalDsl.g:5110:2: rule__SafetyController__Group__0__Impl rule__SafetyController__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__SafetyController__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0"


    // $ANTLR start "rule__SafetyController__Group__0__Impl"
    // InternalDsl.g:5117:1: rule__SafetyController__Group__0__Impl : ( ( rule__SafetyController__NameAssignment_0 )? ) ;
    public final void rule__SafetyController__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5121:1: ( ( ( rule__SafetyController__NameAssignment_0 )? ) )
            // InternalDsl.g:5122:1: ( ( rule__SafetyController__NameAssignment_0 )? )
            {
            // InternalDsl.g:5122:1: ( ( rule__SafetyController__NameAssignment_0 )? )
            // InternalDsl.g:5123:2: ( rule__SafetyController__NameAssignment_0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getNameAssignment_0()); 
            // InternalDsl.g:5124:2: ( rule__SafetyController__NameAssignment_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDsl.g:5124:3: rule__SafetyController__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__0__Impl"


    // $ANTLR start "rule__SafetyController__Group__1"
    // InternalDsl.g:5132:1: rule__SafetyController__Group__1 : rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 ;
    public final void rule__SafetyController__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5136:1: ( rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2 )
            // InternalDsl.g:5137:2: rule__SafetyController__Group__1__Impl rule__SafetyController__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__SafetyController__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__1"


    // $ANTLR start "rule__SafetyController__Group__1__Impl"
    // InternalDsl.g:5144:1: rule__SafetyController__Group__1__Impl : ( ( rule__SafetyController__Group_1__0 )? ) ;
    public final void rule__SafetyController__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5148:1: ( ( ( rule__SafetyController__Group_1__0 )? ) )
            // InternalDsl.g:5149:1: ( ( rule__SafetyController__Group_1__0 )? )
            {
            // InternalDsl.g:5149:1: ( ( rule__SafetyController__Group_1__0 )? )
            // InternalDsl.g:5150:2: ( rule__SafetyController__Group_1__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_1()); 
            // InternalDsl.g:5151:2: ( rule__SafetyController__Group_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalDsl.g:5151:3: rule__SafetyController__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__1__Impl"


    // $ANTLR start "rule__SafetyController__Group__2"
    // InternalDsl.g:5159:1: rule__SafetyController__Group__2 : rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 ;
    public final void rule__SafetyController__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5163:1: ( rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3 )
            // InternalDsl.g:5164:2: rule__SafetyController__Group__2__Impl rule__SafetyController__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SafetyController__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__2"


    // $ANTLR start "rule__SafetyController__Group__2__Impl"
    // InternalDsl.g:5171:1: rule__SafetyController__Group__2__Impl : ( ( rule__SafetyController__Group_2__0 )? ) ;
    public final void rule__SafetyController__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5175:1: ( ( ( rule__SafetyController__Group_2__0 )? ) )
            // InternalDsl.g:5176:1: ( ( rule__SafetyController__Group_2__0 )? )
            {
            // InternalDsl.g:5176:1: ( ( rule__SafetyController__Group_2__0 )? )
            // InternalDsl.g:5177:2: ( rule__SafetyController__Group_2__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_2()); 
            // InternalDsl.g:5178:2: ( rule__SafetyController__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==72) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDsl.g:5178:3: rule__SafetyController__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__2__Impl"


    // $ANTLR start "rule__SafetyController__Group__3"
    // InternalDsl.g:5186:1: rule__SafetyController__Group__3 : rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 ;
    public final void rule__SafetyController__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5190:1: ( rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4 )
            // InternalDsl.g:5191:2: rule__SafetyController__Group__3__Impl rule__SafetyController__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__SafetyController__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__3"


    // $ANTLR start "rule__SafetyController__Group__3__Impl"
    // InternalDsl.g:5198:1: rule__SafetyController__Group__3__Impl : ( ( rule__SafetyController__Group_3__0 )? ) ;
    public final void rule__SafetyController__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5202:1: ( ( ( rule__SafetyController__Group_3__0 )? ) )
            // InternalDsl.g:5203:1: ( ( rule__SafetyController__Group_3__0 )? )
            {
            // InternalDsl.g:5203:1: ( ( rule__SafetyController__Group_3__0 )? )
            // InternalDsl.g:5204:2: ( rule__SafetyController__Group_3__0 )?
            {
             before(grammarAccess.getSafetyControllerAccess().getGroup_3()); 
            // InternalDsl.g:5205:2: ( rule__SafetyController__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalDsl.g:5205:3: rule__SafetyController__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SafetyController__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSafetyControllerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__3__Impl"


    // $ANTLR start "rule__SafetyController__Group__4"
    // InternalDsl.g:5213:1: rule__SafetyController__Group__4 : rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 ;
    public final void rule__SafetyController__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5217:1: ( rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5 )
            // InternalDsl.g:5218:2: rule__SafetyController__Group__4__Impl rule__SafetyController__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__SafetyController__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__4"


    // $ANTLR start "rule__SafetyController__Group__4__Impl"
    // InternalDsl.g:5225:1: rule__SafetyController__Group__4__Impl : ( 'k_velocity' ) ;
    public final void rule__SafetyController__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5229:1: ( ( 'k_velocity' ) )
            // InternalDsl.g:5230:1: ( 'k_velocity' )
            {
            // InternalDsl.g:5230:1: ( 'k_velocity' )
            // InternalDsl.g:5231:2: 'k_velocity'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_velocityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__4__Impl"


    // $ANTLR start "rule__SafetyController__Group__5"
    // InternalDsl.g:5240:1: rule__SafetyController__Group__5 : rule__SafetyController__Group__5__Impl ;
    public final void rule__SafetyController__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5244:1: ( rule__SafetyController__Group__5__Impl )
            // InternalDsl.g:5245:2: rule__SafetyController__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5"


    // $ANTLR start "rule__SafetyController__Group__5__Impl"
    // InternalDsl.g:5251:1: rule__SafetyController__Group__5__Impl : ( ( rule__SafetyController__K_velocityAssignment_5 ) ) ;
    public final void rule__SafetyController__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5255:1: ( ( ( rule__SafetyController__K_velocityAssignment_5 ) ) )
            // InternalDsl.g:5256:1: ( ( rule__SafetyController__K_velocityAssignment_5 ) )
            {
            // InternalDsl.g:5256:1: ( ( rule__SafetyController__K_velocityAssignment_5 ) )
            // InternalDsl.g:5257:2: ( rule__SafetyController__K_velocityAssignment_5 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_5()); 
            // InternalDsl.g:5258:2: ( rule__SafetyController__K_velocityAssignment_5 )
            // InternalDsl.g:5258:3: rule__SafetyController__K_velocityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_velocityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_velocityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group__5__Impl"


    // $ANTLR start "rule__SafetyController__Group_1__0"
    // InternalDsl.g:5267:1: rule__SafetyController__Group_1__0 : rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1 ;
    public final void rule__SafetyController__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5271:1: ( rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1 )
            // InternalDsl.g:5272:2: rule__SafetyController__Group_1__0__Impl rule__SafetyController__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__SafetyController__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__0"


    // $ANTLR start "rule__SafetyController__Group_1__0__Impl"
    // InternalDsl.g:5279:1: rule__SafetyController__Group_1__0__Impl : ( 'softLowerLimit' ) ;
    public final void rule__SafetyController__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5283:1: ( ( 'softLowerLimit' ) )
            // InternalDsl.g:5284:1: ( 'softLowerLimit' )
            {
            // InternalDsl.g:5284:1: ( 'softLowerLimit' )
            // InternalDsl.g:5285:2: 'softLowerLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_1__1"
    // InternalDsl.g:5294:1: rule__SafetyController__Group_1__1 : rule__SafetyController__Group_1__1__Impl ;
    public final void rule__SafetyController__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5298:1: ( rule__SafetyController__Group_1__1__Impl )
            // InternalDsl.g:5299:2: rule__SafetyController__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__1"


    // $ANTLR start "rule__SafetyController__Group_1__1__Impl"
    // InternalDsl.g:5305:1: rule__SafetyController__Group_1__1__Impl : ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) ) ;
    public final void rule__SafetyController__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5309:1: ( ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) ) )
            // InternalDsl.g:5310:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) )
            {
            // InternalDsl.g:5310:1: ( ( rule__SafetyController__SoftLowerLimitAssignment_1_1 ) )
            // InternalDsl.g:5311:2: ( rule__SafetyController__SoftLowerLimitAssignment_1_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_1_1()); 
            // InternalDsl.g:5312:2: ( rule__SafetyController__SoftLowerLimitAssignment_1_1 )
            // InternalDsl.g:5312:3: rule__SafetyController__SoftLowerLimitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftLowerLimitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_1__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__0"
    // InternalDsl.g:5321:1: rule__SafetyController__Group_2__0 : rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 ;
    public final void rule__SafetyController__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5325:1: ( rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1 )
            // InternalDsl.g:5326:2: rule__SafetyController__Group_2__0__Impl rule__SafetyController__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__SafetyController__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__0"


    // $ANTLR start "rule__SafetyController__Group_2__0__Impl"
    // InternalDsl.g:5333:1: rule__SafetyController__Group_2__0__Impl : ( 'softUpperLimit' ) ;
    public final void rule__SafetyController__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5337:1: ( ( 'softUpperLimit' ) )
            // InternalDsl.g:5338:1: ( 'softUpperLimit' )
            {
            // InternalDsl.g:5338:1: ( 'softUpperLimit' )
            // InternalDsl.g:5339:2: 'softUpperLimit'
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_2__1"
    // InternalDsl.g:5348:1: rule__SafetyController__Group_2__1 : rule__SafetyController__Group_2__1__Impl ;
    public final void rule__SafetyController__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5352:1: ( rule__SafetyController__Group_2__1__Impl )
            // InternalDsl.g:5353:2: rule__SafetyController__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__1"


    // $ANTLR start "rule__SafetyController__Group_2__1__Impl"
    // InternalDsl.g:5359:1: rule__SafetyController__Group_2__1__Impl : ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) ) ;
    public final void rule__SafetyController__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5363:1: ( ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) ) )
            // InternalDsl.g:5364:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) )
            {
            // InternalDsl.g:5364:1: ( ( rule__SafetyController__SoftUpperLimitAssignment_2_1 ) )
            // InternalDsl.g:5365:2: ( rule__SafetyController__SoftUpperLimitAssignment_2_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_2_1()); 
            // InternalDsl.g:5366:2: ( rule__SafetyController__SoftUpperLimitAssignment_2_1 )
            // InternalDsl.g:5366:3: rule__SafetyController__SoftUpperLimitAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__SoftUpperLimitAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_2__1__Impl"


    // $ANTLR start "rule__SafetyController__Group_3__0"
    // InternalDsl.g:5375:1: rule__SafetyController__Group_3__0 : rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 ;
    public final void rule__SafetyController__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5379:1: ( rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1 )
            // InternalDsl.g:5380:2: rule__SafetyController__Group_3__0__Impl rule__SafetyController__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__SafetyController__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__0"


    // $ANTLR start "rule__SafetyController__Group_3__0__Impl"
    // InternalDsl.g:5387:1: rule__SafetyController__Group_3__0__Impl : ( 'k_position' ) ;
    public final void rule__SafetyController__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5391:1: ( ( 'k_position' ) )
            // InternalDsl.g:5392:1: ( 'k_position' )
            {
            // InternalDsl.g:5392:1: ( 'k_position' )
            // InternalDsl.g:5393:2: 'k_position'
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getK_positionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__0__Impl"


    // $ANTLR start "rule__SafetyController__Group_3__1"
    // InternalDsl.g:5402:1: rule__SafetyController__Group_3__1 : rule__SafetyController__Group_3__1__Impl ;
    public final void rule__SafetyController__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5406:1: ( rule__SafetyController__Group_3__1__Impl )
            // InternalDsl.g:5407:2: rule__SafetyController__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__1"


    // $ANTLR start "rule__SafetyController__Group_3__1__Impl"
    // InternalDsl.g:5413:1: rule__SafetyController__Group_3__1__Impl : ( ( rule__SafetyController__K_positionAssignment_3_1 ) ) ;
    public final void rule__SafetyController__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5417:1: ( ( ( rule__SafetyController__K_positionAssignment_3_1 ) ) )
            // InternalDsl.g:5418:1: ( ( rule__SafetyController__K_positionAssignment_3_1 ) )
            {
            // InternalDsl.g:5418:1: ( ( rule__SafetyController__K_positionAssignment_3_1 ) )
            // InternalDsl.g:5419:2: ( rule__SafetyController__K_positionAssignment_3_1 )
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_3_1()); 
            // InternalDsl.g:5420:2: ( rule__SafetyController__K_positionAssignment_3_1 )
            // InternalDsl.g:5420:3: rule__SafetyController__K_positionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SafetyController__K_positionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSafetyControllerAccess().getK_positionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__Group_3__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__0"
    // InternalDsl.g:5429:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5433:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // InternalDsl.g:5434:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__FLOAT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0"


    // $ANTLR start "rule__FLOAT__Group__0__Impl"
    // InternalDsl.g:5441:1: rule__FLOAT__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5445:1: ( ( RULE_INT ) )
            // InternalDsl.g:5446:1: ( RULE_INT )
            {
            // InternalDsl.g:5446:1: ( RULE_INT )
            // InternalDsl.g:5447:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__0__Impl"


    // $ANTLR start "rule__FLOAT__Group__1"
    // InternalDsl.g:5456:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5460:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // InternalDsl.g:5461:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__FLOAT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1"


    // $ANTLR start "rule__FLOAT__Group__1__Impl"
    // InternalDsl.g:5468:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5472:1: ( ( '.' ) )
            // InternalDsl.g:5473:1: ( '.' )
            {
            // InternalDsl.g:5473:1: ( '.' )
            // InternalDsl.g:5474:2: '.'
            {
             before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__1__Impl"


    // $ANTLR start "rule__FLOAT__Group__2"
    // InternalDsl.g:5483:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5487:1: ( rule__FLOAT__Group__2__Impl )
            // InternalDsl.g:5488:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FLOAT__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2"


    // $ANTLR start "rule__FLOAT__Group__2__Impl"
    // InternalDsl.g:5494:1: rule__FLOAT__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5498:1: ( ( RULE_INT ) )
            // InternalDsl.g:5499:1: ( RULE_INT )
            {
            // InternalDsl.g:5499:1: ( RULE_INT )
            // InternalDsl.g:5500:2: RULE_INT
            {
             before(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FLOAT__Group__2__Impl"


    // $ANTLR start "rule__SCIENTIFIC__Group__0"
    // InternalDsl.g:5510:1: rule__SCIENTIFIC__Group__0 : rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 ;
    public final void rule__SCIENTIFIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5514:1: ( rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1 )
            // InternalDsl.g:5515:2: rule__SCIENTIFIC__Group__0__Impl rule__SCIENTIFIC__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__SCIENTIFIC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Group__0"


    // $ANTLR start "rule__SCIENTIFIC__Group__0__Impl"
    // InternalDsl.g:5522:1: rule__SCIENTIFIC__Group__0__Impl : ( ruleFLOAT ) ;
    public final void rule__SCIENTIFIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5526:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:5527:1: ( ruleFLOAT )
            {
            // InternalDsl.g:5527:1: ( ruleFLOAT )
            // InternalDsl.g:5528:2: ruleFLOAT
            {
             before(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getSCIENTIFICAccess().getFLOATParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Group__0__Impl"


    // $ANTLR start "rule__SCIENTIFIC__Group__1"
    // InternalDsl.g:5537:1: rule__SCIENTIFIC__Group__1 : rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 ;
    public final void rule__SCIENTIFIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5541:1: ( rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2 )
            // InternalDsl.g:5542:2: rule__SCIENTIFIC__Group__1__Impl rule__SCIENTIFIC__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__SCIENTIFIC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Group__1"


    // $ANTLR start "rule__SCIENTIFIC__Group__1__Impl"
    // InternalDsl.g:5549:1: rule__SCIENTIFIC__Group__1__Impl : ( 'e' ) ;
    public final void rule__SCIENTIFIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5553:1: ( ( 'e' ) )
            // InternalDsl.g:5554:1: ( 'e' )
            {
            // InternalDsl.g:5554:1: ( 'e' )
            // InternalDsl.g:5555:2: 'e'
            {
             before(grammarAccess.getSCIENTIFICAccess().getEKeyword_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getSCIENTIFICAccess().getEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Group__1__Impl"


    // $ANTLR start "rule__SCIENTIFIC__Group__2"
    // InternalDsl.g:5564:1: rule__SCIENTIFIC__Group__2 : rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 ;
    public final void rule__SCIENTIFIC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5568:1: ( rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3 )
            // InternalDsl.g:5569:2: rule__SCIENTIFIC__Group__2__Impl rule__SCIENTIFIC__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__SCIENTIFIC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Group__2"


    // $ANTLR start "rule__SCIENTIFIC__Group__2__Impl"
    // InternalDsl.g:5576:1: rule__SCIENTIFIC__Group__2__Impl : ( ( rule__SCIENTIFIC__Alternatives_2 )? ) ;
    public final void rule__SCIENTIFIC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5580:1: ( ( ( rule__SCIENTIFIC__Alternatives_2 )? ) )
            // InternalDsl.g:5581:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            {
            // InternalDsl.g:5581:1: ( ( rule__SCIENTIFIC__Alternatives_2 )? )
            // InternalDsl.g:5582:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            {
             before(grammarAccess.getSCIENTIFICAccess().getAlternatives_2()); 
            // InternalDsl.g:5583:2: ( rule__SCIENTIFIC__Alternatives_2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=12 && LA53_0<=13)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDsl.g:5583:3: rule__SCIENTIFIC__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SCIENTIFIC__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSCIENTIFICAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Group__2__Impl"


    // $ANTLR start "rule__SCIENTIFIC__Group__3"
    // InternalDsl.g:5591:1: rule__SCIENTIFIC__Group__3 : rule__SCIENTIFIC__Group__3__Impl ;
    public final void rule__SCIENTIFIC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5595:1: ( rule__SCIENTIFIC__Group__3__Impl )
            // InternalDsl.g:5596:2: rule__SCIENTIFIC__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SCIENTIFIC__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Group__3"


    // $ANTLR start "rule__SCIENTIFIC__Group__3__Impl"
    // InternalDsl.g:5602:1: rule__SCIENTIFIC__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__SCIENTIFIC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5606:1: ( ( RULE_INT ) )
            // InternalDsl.g:5607:1: ( RULE_INT )
            {
            // InternalDsl.g:5607:1: ( RULE_INT )
            // InternalDsl.g:5608:2: RULE_INT
            {
             before(grammarAccess.getSCIENTIFICAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSCIENTIFICAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SCIENTIFIC__Group__3__Impl"


    // $ANTLR start "rule__SIGNED_NUMERIC__Group__0"
    // InternalDsl.g:5618:1: rule__SIGNED_NUMERIC__Group__0 : rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 ;
    public final void rule__SIGNED_NUMERIC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5622:1: ( rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1 )
            // InternalDsl.g:5623:2: rule__SIGNED_NUMERIC__Group__0__Impl rule__SIGNED_NUMERIC__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__SIGNED_NUMERIC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SIGNED_NUMERIC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMERIC__Group__0"


    // $ANTLR start "rule__SIGNED_NUMERIC__Group__0__Impl"
    // InternalDsl.g:5630:1: rule__SIGNED_NUMERIC__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__SIGNED_NUMERIC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5634:1: ( ( ( '-' )? ) )
            // InternalDsl.g:5635:1: ( ( '-' )? )
            {
            // InternalDsl.g:5635:1: ( ( '-' )? )
            // InternalDsl.g:5636:2: ( '-' )?
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0()); 
            // InternalDsl.g:5637:2: ( '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==13) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalDsl.g:5637:3: '-'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSIGNED_NUMERICAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMERIC__Group__0__Impl"


    // $ANTLR start "rule__SIGNED_NUMERIC__Group__1"
    // InternalDsl.g:5645:1: rule__SIGNED_NUMERIC__Group__1 : rule__SIGNED_NUMERIC__Group__1__Impl ;
    public final void rule__SIGNED_NUMERIC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5649:1: ( rule__SIGNED_NUMERIC__Group__1__Impl )
            // InternalDsl.g:5650:2: rule__SIGNED_NUMERIC__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SIGNED_NUMERIC__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMERIC__Group__1"


    // $ANTLR start "rule__SIGNED_NUMERIC__Group__1__Impl"
    // InternalDsl.g:5656:1: rule__SIGNED_NUMERIC__Group__1__Impl : ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) ;
    public final void rule__SIGNED_NUMERIC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5660:1: ( ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) ) )
            // InternalDsl.g:5661:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            {
            // InternalDsl.g:5661:1: ( ( rule__SIGNED_NUMERIC__Alternatives_1 ) )
            // InternalDsl.g:5662:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            {
             before(grammarAccess.getSIGNED_NUMERICAccess().getAlternatives_1()); 
            // InternalDsl.g:5663:2: ( rule__SIGNED_NUMERIC__Alternatives_1 )
            // InternalDsl.g:5663:3: rule__SIGNED_NUMERIC__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__SIGNED_NUMERIC__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSIGNED_NUMERICAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SIGNED_NUMERIC__Group__1__Impl"


    // $ANTLR start "rule__Robot__NameAssignment_1"
    // InternalDsl.g:5672:1: rule__Robot__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Robot__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5676:1: ( ( RULE_ID ) )
            // InternalDsl.g:5677:2: ( RULE_ID )
            {
            // InternalDsl.g:5677:2: ( RULE_ID )
            // InternalDsl.g:5678:3: RULE_ID
            {
             before(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_1"


    // $ANTLR start "rule__Robot__LinkAssignment_2_0"
    // InternalDsl.g:5687:1: rule__Robot__LinkAssignment_2_0 : ( ruleLink ) ;
    public final void rule__Robot__LinkAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5691:1: ( ( ruleLink ) )
            // InternalDsl.g:5692:2: ( ruleLink )
            {
            // InternalDsl.g:5692:2: ( ruleLink )
            // InternalDsl.g:5693:3: ruleLink
            {
             before(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLink();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getLinkLinkParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__LinkAssignment_2_0"


    // $ANTLR start "rule__Robot__JointAssignment_2_1"
    // InternalDsl.g:5702:1: rule__Robot__JointAssignment_2_1 : ( ruleJoint ) ;
    public final void rule__Robot__JointAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5706:1: ( ( ruleJoint ) )
            // InternalDsl.g:5707:2: ( ruleJoint )
            {
            // InternalDsl.g:5707:2: ( ruleJoint )
            // InternalDsl.g:5708:3: ruleJoint
            {
             before(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoint();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getJointJointParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__JointAssignment_2_1"


    // $ANTLR start "rule__Link__NameAssignment_1"
    // InternalDsl.g:5717:1: rule__Link__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Link__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5721:1: ( ( RULE_ID ) )
            // InternalDsl.g:5722:2: ( RULE_ID )
            {
            // InternalDsl.g:5722:2: ( RULE_ID )
            // InternalDsl.g:5723:3: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__NameAssignment_1"


    // $ANTLR start "rule__Link__VisualsAssignment_2"
    // InternalDsl.g:5732:1: rule__Link__VisualsAssignment_2 : ( ruleVisual ) ;
    public final void rule__Link__VisualsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5736:1: ( ( ruleVisual ) )
            // InternalDsl.g:5737:2: ( ruleVisual )
            {
            // InternalDsl.g:5737:2: ( ruleVisual )
            // InternalDsl.g:5738:3: ruleVisual
            {
             before(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVisual();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getVisualsVisualParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__VisualsAssignment_2"


    // $ANTLR start "rule__Link__InertialAssignment_3"
    // InternalDsl.g:5747:1: rule__Link__InertialAssignment_3 : ( ruleInertial ) ;
    public final void rule__Link__InertialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5751:1: ( ( ruleInertial ) )
            // InternalDsl.g:5752:2: ( ruleInertial )
            {
            // InternalDsl.g:5752:2: ( ruleInertial )
            // InternalDsl.g:5753:3: ruleInertial
            {
             before(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInertial();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getInertialInertialParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__InertialAssignment_3"


    // $ANTLR start "rule__Link__CollisionAssignment_4"
    // InternalDsl.g:5762:1: rule__Link__CollisionAssignment_4 : ( ruleCollision ) ;
    public final void rule__Link__CollisionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5766:1: ( ( ruleCollision ) )
            // InternalDsl.g:5767:2: ( ruleCollision )
            {
            // InternalDsl.g:5767:2: ( ruleCollision )
            // InternalDsl.g:5768:3: ruleCollision
            {
             before(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCollision();

            state._fsp--;

             after(grammarAccess.getLinkAccess().getCollisionCollisionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Link__CollisionAssignment_4"


    // $ANTLR start "rule__Joint__NameAssignment_1"
    // InternalDsl.g:5777:1: rule__Joint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Joint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5781:1: ( ( RULE_ID ) )
            // InternalDsl.g:5782:2: ( RULE_ID )
            {
            // InternalDsl.g:5782:2: ( RULE_ID )
            // InternalDsl.g:5783:3: RULE_ID
            {
             before(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__NameAssignment_1"


    // $ANTLR start "rule__Joint__TypeAssignment_3"
    // InternalDsl.g:5792:1: rule__Joint__TypeAssignment_3 : ( ruleJointType ) ;
    public final void rule__Joint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5796:1: ( ( ruleJointType ) )
            // InternalDsl.g:5797:2: ( ruleJointType )
            {
            // InternalDsl.g:5797:2: ( ruleJointType )
            // InternalDsl.g:5798:3: ruleJointType
            {
             before(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJointType();

            state._fsp--;

             after(grammarAccess.getJointAccess().getTypeJointTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__TypeAssignment_3"


    // $ANTLR start "rule__Joint__ChildOfAssignment_5"
    // InternalDsl.g:5807:1: rule__Joint__ChildOfAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ChildOfAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5811:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:5812:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:5812:2: ( ( RULE_ID ) )
            // InternalDsl.g:5813:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0()); 
            // InternalDsl.g:5814:3: ( RULE_ID )
            // InternalDsl.g:5815:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getChildOfLinkIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getJointAccess().getChildOfLinkCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ChildOfAssignment_5"


    // $ANTLR start "rule__Joint__ParentOfAssignment_7"
    // InternalDsl.g:5826:1: rule__Joint__ParentOfAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Joint__ParentOfAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5830:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:5831:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:5831:2: ( ( RULE_ID ) )
            // InternalDsl.g:5832:3: ( RULE_ID )
            {
             before(grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0()); 
            // InternalDsl.g:5833:3: ( RULE_ID )
            // InternalDsl.g:5834:4: RULE_ID
            {
             before(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJointAccess().getParentOfLinkIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getJointAccess().getParentOfLinkCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__ParentOfAssignment_7"


    // $ANTLR start "rule__Joint__LimitAssignment_8_1"
    // InternalDsl.g:5845:1: rule__Joint__LimitAssignment_8_1 : ( ruleLimit ) ;
    public final void rule__Joint__LimitAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5849:1: ( ( ruleLimit ) )
            // InternalDsl.g:5850:2: ( ruleLimit )
            {
            // InternalDsl.g:5850:2: ( ruleLimit )
            // InternalDsl.g:5851:3: ruleLimit
            {
             before(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLimit();

            state._fsp--;

             after(grammarAccess.getJointAccess().getLimitLimitParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__LimitAssignment_8_1"


    // $ANTLR start "rule__Joint__AxisAssignment_9_1"
    // InternalDsl.g:5860:1: rule__Joint__AxisAssignment_9_1 : ( ruleAxis ) ;
    public final void rule__Joint__AxisAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5864:1: ( ( ruleAxis ) )
            // InternalDsl.g:5865:2: ( ruleAxis )
            {
            // InternalDsl.g:5865:2: ( ruleAxis )
            // InternalDsl.g:5866:3: ruleAxis
            {
             before(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getJointAccess().getAxisAxisParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__AxisAssignment_9_1"


    // $ANTLR start "rule__Joint__OriginAssignment_10"
    // InternalDsl.g:5875:1: rule__Joint__OriginAssignment_10 : ( ruleOrigin ) ;
    public final void rule__Joint__OriginAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5879:1: ( ( ruleOrigin ) )
            // InternalDsl.g:5880:2: ( ruleOrigin )
            {
            // InternalDsl.g:5880:2: ( ruleOrigin )
            // InternalDsl.g:5881:3: ruleOrigin
            {
             before(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getJointAccess().getOriginOriginParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__OriginAssignment_10"


    // $ANTLR start "rule__Joint__CalibrationAssignment_11_1"
    // InternalDsl.g:5890:1: rule__Joint__CalibrationAssignment_11_1 : ( ruleCalibration ) ;
    public final void rule__Joint__CalibrationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5894:1: ( ( ruleCalibration ) )
            // InternalDsl.g:5895:2: ( ruleCalibration )
            {
            // InternalDsl.g:5895:2: ( ruleCalibration )
            // InternalDsl.g:5896:3: ruleCalibration
            {
             before(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalibration();

            state._fsp--;

             after(grammarAccess.getJointAccess().getCalibrationCalibrationParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__CalibrationAssignment_11_1"


    // $ANTLR start "rule__Joint__DynamicsAssignment_12_1"
    // InternalDsl.g:5905:1: rule__Joint__DynamicsAssignment_12_1 : ( ruleDynamics ) ;
    public final void rule__Joint__DynamicsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5909:1: ( ( ruleDynamics ) )
            // InternalDsl.g:5910:2: ( ruleDynamics )
            {
            // InternalDsl.g:5910:2: ( ruleDynamics )
            // InternalDsl.g:5911:3: ruleDynamics
            {
             before(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamics();

            state._fsp--;

             after(grammarAccess.getJointAccess().getDynamicsDynamicsParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__DynamicsAssignment_12_1"


    // $ANTLR start "rule__Joint__MimicAssignment_13_1"
    // InternalDsl.g:5920:1: rule__Joint__MimicAssignment_13_1 : ( ruleMimic ) ;
    public final void rule__Joint__MimicAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5924:1: ( ( ruleMimic ) )
            // InternalDsl.g:5925:2: ( ruleMimic )
            {
            // InternalDsl.g:5925:2: ( ruleMimic )
            // InternalDsl.g:5926:3: ruleMimic
            {
             before(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMimic();

            state._fsp--;

             after(grammarAccess.getJointAccess().getMimicMimicParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__MimicAssignment_13_1"


    // $ANTLR start "rule__Joint__SafetycontrollerAssignment_14_1"
    // InternalDsl.g:5935:1: rule__Joint__SafetycontrollerAssignment_14_1 : ( ruleSafetyController ) ;
    public final void rule__Joint__SafetycontrollerAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5939:1: ( ( ruleSafetyController ) )
            // InternalDsl.g:5940:2: ( ruleSafetyController )
            {
            // InternalDsl.g:5940:2: ( ruleSafetyController )
            // InternalDsl.g:5941:3: ruleSafetyController
            {
             before(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSafetyController();

            state._fsp--;

             after(grammarAccess.getJointAccess().getSafetycontrollerSafetyControllerParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joint__SafetycontrollerAssignment_14_1"


    // $ANTLR start "rule__Inertial__NameAssignment_1"
    // InternalDsl.g:5950:1: rule__Inertial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Inertial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5954:1: ( ( RULE_ID ) )
            // InternalDsl.g:5955:2: ( RULE_ID )
            {
            // InternalDsl.g:5955:2: ( RULE_ID )
            // InternalDsl.g:5956:3: RULE_ID
            {
             before(grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertialAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__NameAssignment_1"


    // $ANTLR start "rule__Inertial__InertiaAssignment_2"
    // InternalDsl.g:5965:1: rule__Inertial__InertiaAssignment_2 : ( ruleInertia ) ;
    public final void rule__Inertial__InertiaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5969:1: ( ( ruleInertia ) )
            // InternalDsl.g:5970:2: ( ruleInertia )
            {
            // InternalDsl.g:5970:2: ( ruleInertia )
            // InternalDsl.g:5971:3: ruleInertia
            {
             before(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInertia();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getInertiaInertiaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__InertiaAssignment_2"


    // $ANTLR start "rule__Inertial__MassAssignment_3"
    // InternalDsl.g:5980:1: rule__Inertial__MassAssignment_3 : ( ruleMass ) ;
    public final void rule__Inertial__MassAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5984:1: ( ( ruleMass ) )
            // InternalDsl.g:5985:2: ( ruleMass )
            {
            // InternalDsl.g:5985:2: ( ruleMass )
            // InternalDsl.g:5986:3: ruleMass
            {
             before(grammarAccess.getInertialAccess().getMassMassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMass();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getMassMassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__MassAssignment_3"


    // $ANTLR start "rule__Inertial__OriginAssignment_4"
    // InternalDsl.g:5995:1: rule__Inertial__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Inertial__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:5999:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6000:2: ( ruleOrigin )
            {
            // InternalDsl.g:6000:2: ( ruleOrigin )
            // InternalDsl.g:6001:3: ruleOrigin
            {
             before(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getInertialAccess().getOriginOriginParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertial__OriginAssignment_4"


    // $ANTLR start "rule__Visual__NameAssignment_1"
    // InternalDsl.g:6010:1: rule__Visual__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Visual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6014:1: ( ( RULE_ID ) )
            // InternalDsl.g:6015:2: ( RULE_ID )
            {
            // InternalDsl.g:6015:2: ( RULE_ID )
            // InternalDsl.g:6016:3: RULE_ID
            {
             before(grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisualAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__NameAssignment_1"


    // $ANTLR start "rule__Visual__GeometryAssignment_3"
    // InternalDsl.g:6025:1: rule__Visual__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Visual__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6029:1: ( ( ruleGeometry ) )
            // InternalDsl.g:6030:2: ( ruleGeometry )
            {
            // InternalDsl.g:6030:2: ( ruleGeometry )
            // InternalDsl.g:6031:3: ruleGeometry
            {
             before(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getGeometryGeometryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__GeometryAssignment_3"


    // $ANTLR start "rule__Visual__OriginAssignment_4"
    // InternalDsl.g:6040:1: rule__Visual__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Visual__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6044:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6045:2: ( ruleOrigin )
            {
            // InternalDsl.g:6045:2: ( ruleOrigin )
            // InternalDsl.g:6046:3: ruleOrigin
            {
             before(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getOriginOriginParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__OriginAssignment_4"


    // $ANTLR start "rule__Visual__MaterialAssignment_5_1"
    // InternalDsl.g:6055:1: rule__Visual__MaterialAssignment_5_1 : ( ruleMaterial ) ;
    public final void rule__Visual__MaterialAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6059:1: ( ( ruleMaterial ) )
            // InternalDsl.g:6060:2: ( ruleMaterial )
            {
            // InternalDsl.g:6060:2: ( ruleMaterial )
            // InternalDsl.g:6061:3: ruleMaterial
            {
             before(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getVisualAccess().getMaterialMaterialParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual__MaterialAssignment_5_1"


    // $ANTLR start "rule__Collision__NameAssignment_1"
    // InternalDsl.g:6070:1: rule__Collision__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Collision__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6074:1: ( ( RULE_ID ) )
            // InternalDsl.g:6075:2: ( RULE_ID )
            {
            // InternalDsl.g:6075:2: ( RULE_ID )
            // InternalDsl.g:6076:3: RULE_ID
            {
             before(grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCollisionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__NameAssignment_1"


    // $ANTLR start "rule__Collision__GeometryAssignment_3"
    // InternalDsl.g:6085:1: rule__Collision__GeometryAssignment_3 : ( ruleGeometry ) ;
    public final void rule__Collision__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6089:1: ( ( ruleGeometry ) )
            // InternalDsl.g:6090:2: ( ruleGeometry )
            {
            // InternalDsl.g:6090:2: ( ruleGeometry )
            // InternalDsl.g:6091:3: ruleGeometry
            {
             before(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGeometry();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getGeometryGeometryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__GeometryAssignment_3"


    // $ANTLR start "rule__Collision__OriginAssignment_4"
    // InternalDsl.g:6100:1: rule__Collision__OriginAssignment_4 : ( ruleOrigin ) ;
    public final void rule__Collision__OriginAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6104:1: ( ( ruleOrigin ) )
            // InternalDsl.g:6105:2: ( ruleOrigin )
            {
            // InternalDsl.g:6105:2: ( ruleOrigin )
            // InternalDsl.g:6106:3: ruleOrigin
            {
             before(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getCollisionAccess().getOriginOriginParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collision__OriginAssignment_4"


    // $ANTLR start "rule__Origin__NameAssignment_1"
    // InternalDsl.g:6115:1: rule__Origin__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Origin__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6119:1: ( ( RULE_ID ) )
            // InternalDsl.g:6120:2: ( RULE_ID )
            {
            // InternalDsl.g:6120:2: ( RULE_ID )
            // InternalDsl.g:6121:3: RULE_ID
            {
             before(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__NameAssignment_1"


    // $ANTLR start "rule__Origin__XAssignment_3"
    // InternalDsl.g:6130:1: rule__Origin__XAssignment_3 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Origin__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6134:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6135:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6135:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6136:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getOriginAccess().getXSIGNED_NUMERICParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getXSIGNED_NUMERICParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__XAssignment_3"


    // $ANTLR start "rule__Origin__YAssignment_4"
    // InternalDsl.g:6145:1: rule__Origin__YAssignment_4 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Origin__YAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6149:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6150:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6150:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6151:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getOriginAccess().getYSIGNED_NUMERICParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYSIGNED_NUMERICParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YAssignment_4"


    // $ANTLR start "rule__Origin__ZAssignment_5"
    // InternalDsl.g:6160:1: rule__Origin__ZAssignment_5 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Origin__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6164:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6165:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6165:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6166:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getOriginAccess().getZSIGNED_NUMERICParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getZSIGNED_NUMERICParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__ZAssignment_5"


    // $ANTLR start "rule__Origin__RollAssignment_6_1"
    // InternalDsl.g:6175:1: rule__Origin__RollAssignment_6_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Origin__RollAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6179:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6180:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6180:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6181:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getOriginAccess().getRollSIGNED_NUMERICParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getRollSIGNED_NUMERICParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__RollAssignment_6_1"


    // $ANTLR start "rule__Origin__PitchAssignment_6_2"
    // InternalDsl.g:6190:1: rule__Origin__PitchAssignment_6_2 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Origin__PitchAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6194:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6195:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6195:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6196:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getOriginAccess().getPitchSIGNED_NUMERICParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getPitchSIGNED_NUMERICParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__PitchAssignment_6_2"


    // $ANTLR start "rule__Origin__YawAssignment_6_3"
    // InternalDsl.g:6205:1: rule__Origin__YawAssignment_6_3 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Origin__YawAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6209:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6210:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6210:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6211:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getOriginAccess().getYawSIGNED_NUMERICParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getYawSIGNED_NUMERICParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__YawAssignment_6_3"


    // $ANTLR start "rule__Mass__NameAssignment_1"
    // InternalDsl.g:6220:1: rule__Mass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6224:1: ( ( RULE_ID ) )
            // InternalDsl.g:6225:2: ( RULE_ID )
            {
            // InternalDsl.g:6225:2: ( RULE_ID )
            // InternalDsl.g:6226:3: RULE_ID
            {
             before(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__NameAssignment_1"


    // $ANTLR start "rule__Mass__MassValueInKilogramsAssignment_3"
    // InternalDsl.g:6235:1: rule__Mass__MassValueInKilogramsAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Mass__MassValueInKilogramsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6239:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6240:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6240:2: ( ruleFLOAT )
            // InternalDsl.g:6241:3: ruleFLOAT
            {
             before(grammarAccess.getMassAccess().getMassValueInKilogramsFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getMassAccess().getMassValueInKilogramsFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mass__MassValueInKilogramsAssignment_3"


    // $ANTLR start "rule__Inertia__NameAssignment_1"
    // InternalDsl.g:6250:1: rule__Inertia__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Inertia__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6254:1: ( ( RULE_ID ) )
            // InternalDsl.g:6255:2: ( RULE_ID )
            {
            // InternalDsl.g:6255:2: ( RULE_ID )
            // InternalDsl.g:6256:3: RULE_ID
            {
             before(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInertiaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__NameAssignment_1"


    // $ANTLR start "rule__Inertia__IxxAssignment_3"
    // InternalDsl.g:6265:1: rule__Inertia__IxxAssignment_3 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Inertia__IxxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6269:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6270:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6270:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6271:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getInertiaAccess().getIxxSIGNED_NUMERICParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxxSIGNED_NUMERICParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxxAssignment_3"


    // $ANTLR start "rule__Inertia__IxyAssignment_5"
    // InternalDsl.g:6280:1: rule__Inertia__IxyAssignment_5 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Inertia__IxyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6284:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6285:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6285:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6286:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getInertiaAccess().getIxySIGNED_NUMERICParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxySIGNED_NUMERICParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxyAssignment_5"


    // $ANTLR start "rule__Inertia__IxzAssignment_7"
    // InternalDsl.g:6295:1: rule__Inertia__IxzAssignment_7 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Inertia__IxzAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6299:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6300:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6300:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6301:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getInertiaAccess().getIxzSIGNED_NUMERICParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIxzSIGNED_NUMERICParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IxzAssignment_7"


    // $ANTLR start "rule__Inertia__IyyAssignment_9"
    // InternalDsl.g:6310:1: rule__Inertia__IyyAssignment_9 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Inertia__IyyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6314:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6315:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6315:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6316:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getInertiaAccess().getIyySIGNED_NUMERICParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyySIGNED_NUMERICParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyyAssignment_9"


    // $ANTLR start "rule__Inertia__IyzAssignment_11"
    // InternalDsl.g:6325:1: rule__Inertia__IyzAssignment_11 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Inertia__IyzAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6329:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6330:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6330:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6331:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getInertiaAccess().getIyzSIGNED_NUMERICParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIyzSIGNED_NUMERICParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IyzAssignment_11"


    // $ANTLR start "rule__Inertia__IzzAssignment_13"
    // InternalDsl.g:6340:1: rule__Inertia__IzzAssignment_13 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Inertia__IzzAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6344:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6345:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6345:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6346:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getInertiaAccess().getIzzSIGNED_NUMERICParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getInertiaAccess().getIzzSIGNED_NUMERICParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inertia__IzzAssignment_13"


    // $ANTLR start "rule__Color__NameAssignment_1"
    // InternalDsl.g:6355:1: rule__Color__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6359:1: ( ( RULE_ID ) )
            // InternalDsl.g:6360:2: ( RULE_ID )
            {
            // InternalDsl.g:6360:2: ( RULE_ID )
            // InternalDsl.g:6361:3: RULE_ID
            {
             before(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__NameAssignment_1"


    // $ANTLR start "rule__Color__RedAssignment_3"
    // InternalDsl.g:6370:1: rule__Color__RedAssignment_3 : ( ruleFLOAT ) ;
    public final void rule__Color__RedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6374:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6375:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6375:2: ( ruleFLOAT )
            // InternalDsl.g:6376:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedFLOATParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__RedAssignment_3"


    // $ANTLR start "rule__Color__GreenAssignment_4"
    // InternalDsl.g:6385:1: rule__Color__GreenAssignment_4 : ( ruleFLOAT ) ;
    public final void rule__Color__GreenAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6389:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6390:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6390:2: ( ruleFLOAT )
            // InternalDsl.g:6391:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenFLOATParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__GreenAssignment_4"


    // $ANTLR start "rule__Color__BlueAssignment_5"
    // InternalDsl.g:6400:1: rule__Color__BlueAssignment_5 : ( ruleFLOAT ) ;
    public final void rule__Color__BlueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6404:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6405:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6405:2: ( ruleFLOAT )
            // InternalDsl.g:6406:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueFLOATParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__BlueAssignment_5"


    // $ANTLR start "rule__Color__AlphaAssignment_6"
    // InternalDsl.g:6415:1: rule__Color__AlphaAssignment_6 : ( ruleFLOAT ) ;
    public final void rule__Color__AlphaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6419:1: ( ( ruleFLOAT ) )
            // InternalDsl.g:6420:2: ( ruleFLOAT )
            {
            // InternalDsl.g:6420:2: ( ruleFLOAT )
            // InternalDsl.g:6421:3: ruleFLOAT
            {
             before(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFLOAT();

            state._fsp--;

             after(grammarAccess.getColorAccess().getAlphaFLOATParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__AlphaAssignment_6"


    // $ANTLR start "rule__Texture__NameAssignment_1"
    // InternalDsl.g:6430:1: rule__Texture__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Texture__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6434:1: ( ( RULE_ID ) )
            // InternalDsl.g:6435:2: ( RULE_ID )
            {
            // InternalDsl.g:6435:2: ( RULE_ID )
            // InternalDsl.g:6436:3: RULE_ID
            {
             before(grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__NameAssignment_1"


    // $ANTLR start "rule__Texture__PathToFileAssignment_3"
    // InternalDsl.g:6445:1: rule__Texture__PathToFileAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Texture__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6449:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6450:2: ( RULE_STRING )
            {
            // InternalDsl.g:6450:2: ( RULE_STRING )
            // InternalDsl.g:6451:3: RULE_STRING
            {
             before(grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextureAccess().getPathToFileSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Texture__PathToFileAssignment_3"


    // $ANTLR start "rule__Box__NameAssignment_1"
    // InternalDsl.g:6460:1: rule__Box__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Box__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6464:1: ( ( RULE_ID ) )
            // InternalDsl.g:6465:2: ( RULE_ID )
            {
            // InternalDsl.g:6465:2: ( RULE_ID )
            // InternalDsl.g:6466:3: RULE_ID
            {
             before(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBoxAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__NameAssignment_1"


    // $ANTLR start "rule__Box__HeightAssignment_3"
    // InternalDsl.g:6475:1: rule__Box__HeightAssignment_3 : ( ruleMEASURE ) ;
    public final void rule__Box__HeightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6479:1: ( ( ruleMEASURE ) )
            // InternalDsl.g:6480:2: ( ruleMEASURE )
            {
            // InternalDsl.g:6480:2: ( ruleMEASURE )
            // InternalDsl.g:6481:3: ruleMEASURE
            {
             before(grammarAccess.getBoxAccess().getHeightMEASUREParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMEASURE();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getHeightMEASUREParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__HeightAssignment_3"


    // $ANTLR start "rule__Box__LengthAssignment_4"
    // InternalDsl.g:6490:1: rule__Box__LengthAssignment_4 : ( ruleMEASURE ) ;
    public final void rule__Box__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6494:1: ( ( ruleMEASURE ) )
            // InternalDsl.g:6495:2: ( ruleMEASURE )
            {
            // InternalDsl.g:6495:2: ( ruleMEASURE )
            // InternalDsl.g:6496:3: ruleMEASURE
            {
             before(grammarAccess.getBoxAccess().getLengthMEASUREParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMEASURE();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getLengthMEASUREParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__LengthAssignment_4"


    // $ANTLR start "rule__Box__WidthAssignment_5"
    // InternalDsl.g:6505:1: rule__Box__WidthAssignment_5 : ( ruleMEASURE ) ;
    public final void rule__Box__WidthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6509:1: ( ( ruleMEASURE ) )
            // InternalDsl.g:6510:2: ( ruleMEASURE )
            {
            // InternalDsl.g:6510:2: ( ruleMEASURE )
            // InternalDsl.g:6511:3: ruleMEASURE
            {
             before(grammarAccess.getBoxAccess().getWidthMEASUREParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMEASURE();

            state._fsp--;

             after(grammarAccess.getBoxAccess().getWidthMEASUREParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Box__WidthAssignment_5"


    // $ANTLR start "rule__Cylinder__NameAssignment_1"
    // InternalDsl.g:6520:1: rule__Cylinder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cylinder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6524:1: ( ( RULE_ID ) )
            // InternalDsl.g:6525:2: ( RULE_ID )
            {
            // InternalDsl.g:6525:2: ( RULE_ID )
            // InternalDsl.g:6526:3: RULE_ID
            {
             before(grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCylinderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__NameAssignment_1"


    // $ANTLR start "rule__Cylinder__RadiusAssignment_3"
    // InternalDsl.g:6535:1: rule__Cylinder__RadiusAssignment_3 : ( ruleMEASURE ) ;
    public final void rule__Cylinder__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6539:1: ( ( ruleMEASURE ) )
            // InternalDsl.g:6540:2: ( ruleMEASURE )
            {
            // InternalDsl.g:6540:2: ( ruleMEASURE )
            // InternalDsl.g:6541:3: ruleMEASURE
            {
             before(grammarAccess.getCylinderAccess().getRadiusMEASUREParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMEASURE();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getRadiusMEASUREParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__RadiusAssignment_3"


    // $ANTLR start "rule__Cylinder__LengthAssignment_5"
    // InternalDsl.g:6550:1: rule__Cylinder__LengthAssignment_5 : ( ruleMEASURE ) ;
    public final void rule__Cylinder__LengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6554:1: ( ( ruleMEASURE ) )
            // InternalDsl.g:6555:2: ( ruleMEASURE )
            {
            // InternalDsl.g:6555:2: ( ruleMEASURE )
            // InternalDsl.g:6556:3: ruleMEASURE
            {
             before(grammarAccess.getCylinderAccess().getLengthMEASUREParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMEASURE();

            state._fsp--;

             after(grammarAccess.getCylinderAccess().getLengthMEASUREParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cylinder__LengthAssignment_5"


    // $ANTLR start "rule__Mesh__NameAssignment_1"
    // InternalDsl.g:6565:1: rule__Mesh__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Mesh__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6569:1: ( ( RULE_ID ) )
            // InternalDsl.g:6570:2: ( RULE_ID )
            {
            // InternalDsl.g:6570:2: ( RULE_ID )
            // InternalDsl.g:6571:3: RULE_ID
            {
             before(grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__NameAssignment_1"


    // $ANTLR start "rule__Mesh__PathToFileAssignment_3"
    // InternalDsl.g:6580:1: rule__Mesh__PathToFileAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Mesh__PathToFileAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6584:1: ( ( RULE_STRING ) )
            // InternalDsl.g:6585:2: ( RULE_STRING )
            {
            // InternalDsl.g:6585:2: ( RULE_STRING )
            // InternalDsl.g:6586:3: RULE_STRING
            {
             before(grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getPathToFileSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__PathToFileAssignment_3"


    // $ANTLR start "rule__Mesh__BoxAssignment_4_1"
    // InternalDsl.g:6595:1: rule__Mesh__BoxAssignment_4_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Mesh__BoxAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6599:1: ( ( ( RULE_STRING ) ) )
            // InternalDsl.g:6600:2: ( ( RULE_STRING ) )
            {
            // InternalDsl.g:6600:2: ( ( RULE_STRING ) )
            // InternalDsl.g:6601:3: ( RULE_STRING )
            {
             before(grammarAccess.getMeshAccess().getBoxBoxCrossReference_4_1_0()); 
            // InternalDsl.g:6602:3: ( RULE_STRING )
            // InternalDsl.g:6603:4: RULE_STRING
            {
             before(grammarAccess.getMeshAccess().getBoxBoxSTRINGTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeshAccess().getBoxBoxSTRINGTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMeshAccess().getBoxBoxCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mesh__BoxAssignment_4_1"


    // $ANTLR start "rule__Sphere__NameAssignment_1"
    // InternalDsl.g:6614:1: rule__Sphere__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sphere__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6618:1: ( ( RULE_ID ) )
            // InternalDsl.g:6619:2: ( RULE_ID )
            {
            // InternalDsl.g:6619:2: ( RULE_ID )
            // InternalDsl.g:6620:3: RULE_ID
            {
             before(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSphereAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__NameAssignment_1"


    // $ANTLR start "rule__Sphere__RadiusAssignment_3"
    // InternalDsl.g:6629:1: rule__Sphere__RadiusAssignment_3 : ( ruleMEASURE ) ;
    public final void rule__Sphere__RadiusAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6633:1: ( ( ruleMEASURE ) )
            // InternalDsl.g:6634:2: ( ruleMEASURE )
            {
            // InternalDsl.g:6634:2: ( ruleMEASURE )
            // InternalDsl.g:6635:3: ruleMEASURE
            {
             before(grammarAccess.getSphereAccess().getRadiusMEASUREParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMEASURE();

            state._fsp--;

             after(grammarAccess.getSphereAccess().getRadiusMEASUREParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sphere__RadiusAssignment_3"


    // $ANTLR start "rule__Limit__NameAssignment_0"
    // InternalDsl.g:6644:1: rule__Limit__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Limit__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6648:1: ( ( RULE_ID ) )
            // InternalDsl.g:6649:2: ( RULE_ID )
            {
            // InternalDsl.g:6649:2: ( RULE_ID )
            // InternalDsl.g:6650:3: RULE_ID
            {
             before(grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLimitAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__NameAssignment_0"


    // $ANTLR start "rule__Limit__EffortAssignment_2"
    // InternalDsl.g:6659:1: rule__Limit__EffortAssignment_2 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Limit__EffortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6663:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6664:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6664:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6665:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getLimitAccess().getEffortSIGNED_NUMERICParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getEffortSIGNED_NUMERICParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__EffortAssignment_2"


    // $ANTLR start "rule__Limit__VelocityAssignment_4"
    // InternalDsl.g:6674:1: rule__Limit__VelocityAssignment_4 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Limit__VelocityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6678:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6679:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6679:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6680:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getLimitAccess().getVelocitySIGNED_NUMERICParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getVelocitySIGNED_NUMERICParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__VelocityAssignment_4"


    // $ANTLR start "rule__Limit__LowerAssignment_6"
    // InternalDsl.g:6689:1: rule__Limit__LowerAssignment_6 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Limit__LowerAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6693:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6694:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6694:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6695:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getLimitAccess().getLowerSIGNED_NUMERICParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getLowerSIGNED_NUMERICParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__LowerAssignment_6"


    // $ANTLR start "rule__Limit__UpperAssignment_8"
    // InternalDsl.g:6704:1: rule__Limit__UpperAssignment_8 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Limit__UpperAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6708:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6709:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6709:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6710:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getLimitAccess().getUpperSIGNED_NUMERICParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getLimitAccess().getUpperSIGNED_NUMERICParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Limit__UpperAssignment_8"


    // $ANTLR start "rule__Axis__NameAssignment_0"
    // InternalDsl.g:6719:1: rule__Axis__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Axis__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6723:1: ( ( RULE_ID ) )
            // InternalDsl.g:6724:2: ( RULE_ID )
            {
            // InternalDsl.g:6724:2: ( RULE_ID )
            // InternalDsl.g:6725:3: RULE_ID
            {
             before(grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__NameAssignment_0"


    // $ANTLR start "rule__Axis__XAssignment_2"
    // InternalDsl.g:6734:1: rule__Axis__XAssignment_2 : ( RULE_AXIS_VALUE ) ;
    public final void rule__Axis__XAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6738:1: ( ( RULE_AXIS_VALUE ) )
            // InternalDsl.g:6739:2: ( RULE_AXIS_VALUE )
            {
            // InternalDsl.g:6739:2: ( RULE_AXIS_VALUE )
            // InternalDsl.g:6740:3: RULE_AXIS_VALUE
            {
             before(grammarAccess.getAxisAccess().getXAXIS_VALUETerminalRuleCall_2_0()); 
            match(input,RULE_AXIS_VALUE,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getXAXIS_VALUETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__XAssignment_2"


    // $ANTLR start "rule__Axis__YAssignment_3"
    // InternalDsl.g:6749:1: rule__Axis__YAssignment_3 : ( RULE_AXIS_VALUE ) ;
    public final void rule__Axis__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6753:1: ( ( RULE_AXIS_VALUE ) )
            // InternalDsl.g:6754:2: ( RULE_AXIS_VALUE )
            {
            // InternalDsl.g:6754:2: ( RULE_AXIS_VALUE )
            // InternalDsl.g:6755:3: RULE_AXIS_VALUE
            {
             before(grammarAccess.getAxisAccess().getYAXIS_VALUETerminalRuleCall_3_0()); 
            match(input,RULE_AXIS_VALUE,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getYAXIS_VALUETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__YAssignment_3"


    // $ANTLR start "rule__Axis__ZAssignment_4"
    // InternalDsl.g:6764:1: rule__Axis__ZAssignment_4 : ( RULE_AXIS_VALUE ) ;
    public final void rule__Axis__ZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6768:1: ( ( RULE_AXIS_VALUE ) )
            // InternalDsl.g:6769:2: ( RULE_AXIS_VALUE )
            {
            // InternalDsl.g:6769:2: ( RULE_AXIS_VALUE )
            // InternalDsl.g:6770:3: RULE_AXIS_VALUE
            {
             before(grammarAccess.getAxisAccess().getZAXIS_VALUETerminalRuleCall_4_0()); 
            match(input,RULE_AXIS_VALUE,FOLLOW_2); 
             after(grammarAccess.getAxisAccess().getZAXIS_VALUETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis__ZAssignment_4"


    // $ANTLR start "rule__Calibration__NameAssignment_1"
    // InternalDsl.g:6779:1: rule__Calibration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Calibration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6783:1: ( ( RULE_ID ) )
            // InternalDsl.g:6784:2: ( RULE_ID )
            {
            // InternalDsl.g:6784:2: ( RULE_ID )
            // InternalDsl.g:6785:3: RULE_ID
            {
             before(grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalibrationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__NameAssignment_1"


    // $ANTLR start "rule__Calibration__RisingAssignment_2_1"
    // InternalDsl.g:6794:1: rule__Calibration__RisingAssignment_2_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Calibration__RisingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6798:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6799:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6799:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6800:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getCalibrationAccess().getRisingSIGNED_NUMERICParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getRisingSIGNED_NUMERICParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__RisingAssignment_2_1"


    // $ANTLR start "rule__Calibration__FallingAssignment_3_1"
    // InternalDsl.g:6809:1: rule__Calibration__FallingAssignment_3_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Calibration__FallingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6813:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6814:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6814:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6815:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getCalibrationAccess().getFallingSIGNED_NUMERICParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getCalibrationAccess().getFallingSIGNED_NUMERICParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calibration__FallingAssignment_3_1"


    // $ANTLR start "rule__Dynamics__NameAssignment_1"
    // InternalDsl.g:6824:1: rule__Dynamics__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dynamics__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6828:1: ( ( RULE_ID ) )
            // InternalDsl.g:6829:2: ( RULE_ID )
            {
            // InternalDsl.g:6829:2: ( RULE_ID )
            // InternalDsl.g:6830:3: RULE_ID
            {
             before(grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDynamicsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__NameAssignment_1"


    // $ANTLR start "rule__Dynamics__FrictionAssignment_2_1"
    // InternalDsl.g:6839:1: rule__Dynamics__FrictionAssignment_2_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Dynamics__FrictionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6843:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6844:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6844:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6845:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getDynamicsAccess().getFrictionSIGNED_NUMERICParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getFrictionSIGNED_NUMERICParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__FrictionAssignment_2_1"


    // $ANTLR start "rule__Dynamics__DampingAssignment_3_1"
    // InternalDsl.g:6854:1: rule__Dynamics__DampingAssignment_3_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Dynamics__DampingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6858:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6859:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6859:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6860:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getDynamicsAccess().getDampingSIGNED_NUMERICParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getDynamicsAccess().getDampingSIGNED_NUMERICParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dynamics__DampingAssignment_3_1"


    // $ANTLR start "rule__Mimic__NameAssignment_0"
    // InternalDsl.g:6869:1: rule__Mimic__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Mimic__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6873:1: ( ( RULE_ID ) )
            // InternalDsl.g:6874:2: ( RULE_ID )
            {
            // InternalDsl.g:6874:2: ( RULE_ID )
            // InternalDsl.g:6875:3: RULE_ID
            {
             before(grammarAccess.getMimicAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__NameAssignment_0"


    // $ANTLR start "rule__Mimic__MimicsAssignment_2"
    // InternalDsl.g:6884:1: rule__Mimic__MimicsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Mimic__MimicsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6888:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:6889:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:6889:2: ( ( RULE_ID ) )
            // InternalDsl.g:6890:3: ( RULE_ID )
            {
             before(grammarAccess.getMimicAccess().getMimicsJointCrossReference_2_0()); 
            // InternalDsl.g:6891:3: ( RULE_ID )
            // InternalDsl.g:6892:4: RULE_ID
            {
             before(grammarAccess.getMimicAccess().getMimicsJointIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMimicAccess().getMimicsJointIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMimicAccess().getMimicsJointCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__MimicsAssignment_2"


    // $ANTLR start "rule__Mimic__MultiplierAssignment_3_1"
    // InternalDsl.g:6903:1: rule__Mimic__MultiplierAssignment_3_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Mimic__MultiplierAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6907:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6908:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6908:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6909:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getMimicAccess().getMultiplierSIGNED_NUMERICParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getMimicAccess().getMultiplierSIGNED_NUMERICParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__MultiplierAssignment_3_1"


    // $ANTLR start "rule__Mimic__OffSetAssignment_4_1"
    // InternalDsl.g:6918:1: rule__Mimic__OffSetAssignment_4_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__Mimic__OffSetAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6922:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6923:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6923:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6924:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getMimicAccess().getOffSetSIGNED_NUMERICParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getMimicAccess().getOffSetSIGNED_NUMERICParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimic__OffSetAssignment_4_1"


    // $ANTLR start "rule__SafetyController__NameAssignment_0"
    // InternalDsl.g:6933:1: rule__SafetyController__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SafetyController__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6937:1: ( ( RULE_ID ) )
            // InternalDsl.g:6938:2: ( RULE_ID )
            {
            // InternalDsl.g:6938:2: ( RULE_ID )
            // InternalDsl.g:6939:3: RULE_ID
            {
             before(grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSafetyControllerAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__NameAssignment_0"


    // $ANTLR start "rule__SafetyController__SoftLowerLimitAssignment_1_1"
    // InternalDsl.g:6948:1: rule__SafetyController__SoftLowerLimitAssignment_1_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__SafetyController__SoftLowerLimitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6952:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6953:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6953:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6954:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitSIGNED_NUMERICParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitSIGNED_NUMERICParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftLowerLimitAssignment_1_1"


    // $ANTLR start "rule__SafetyController__SoftUpperLimitAssignment_2_1"
    // InternalDsl.g:6963:1: rule__SafetyController__SoftUpperLimitAssignment_2_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__SafetyController__SoftUpperLimitAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6967:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6968:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6968:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6969:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitSIGNED_NUMERICParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitSIGNED_NUMERICParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__SoftUpperLimitAssignment_2_1"


    // $ANTLR start "rule__SafetyController__K_positionAssignment_3_1"
    // InternalDsl.g:6978:1: rule__SafetyController__K_positionAssignment_3_1 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__SafetyController__K_positionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6982:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6983:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6983:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6984:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getSafetyControllerAccess().getK_positionSIGNED_NUMERICParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_positionSIGNED_NUMERICParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_positionAssignment_3_1"


    // $ANTLR start "rule__SafetyController__K_velocityAssignment_5"
    // InternalDsl.g:6993:1: rule__SafetyController__K_velocityAssignment_5 : ( ruleSIGNED_NUMERIC ) ;
    public final void rule__SafetyController__K_velocityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:6997:1: ( ( ruleSIGNED_NUMERIC ) )
            // InternalDsl.g:6998:2: ( ruleSIGNED_NUMERIC )
            {
            // InternalDsl.g:6998:2: ( ruleSIGNED_NUMERIC )
            // InternalDsl.g:6999:3: ruleSIGNED_NUMERIC
            {
             before(grammarAccess.getSafetyControllerAccess().getK_velocitySIGNED_NUMERICParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSIGNED_NUMERIC();

            state._fsp--;

             after(grammarAccess.getSafetyControllerAccess().getK_velocitySIGNED_NUMERICParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SafetyController__K_velocityAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000004C0000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000083F000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0800000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x8000000000000020L,0x0000000000000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000006L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000008L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L,0x00000000000003C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0528000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000002010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000003010L});

}